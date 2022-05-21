package com.bases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
//import org.testng.annotations.BeforeMethod;

// chia hỏi phần khởi tạo
public class BassClass {
    public WebDriver driver;

    // hàm lấy giá trị driver trả về mà mình đã khởi tạo
    // khi gọi hàm getDriver thì giá trị driver sẽ nhận về giá trị ở hàm setDriver bên dưới
    public WebDriver getDriver () {
        return driver;
    }

    // hàm để tùy chọn Browser
    // hàm này đã trả về ch mình giá trị driver
    private void setDriver (String browserType, String webUrl) {
        switch (browserType) {
            case "chrome":
                driver = initChromeDriver(webUrl);
                break;
            case "firefox":
                driver = initFirefoxDriver(webUrl);
                break;
            default:
                System.out.println("Browser: " + browserType + "is invalid, Launching Chrome browser ...");
                driver = initChromeDriver(webUrl);
        }
    }

    // khởi tạo cấu hình của các Browser
    private static WebDriver initChromeDriver(String webUrl) {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(false);
        System.out.println("Launching Chrome browser ...");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to(webUrl);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    private static WebDriver initFirefoxDriver(String webUrl) {
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        System.out.println("Lunching Firefox browser ...");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to(webUrl);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    // chạy hàm initializeTestBaseSetup trước khi class này được gọi
    @Parameters({"browserType", "webUrl"})
    @BeforeMethod
    public void initializeTestBaseSetup (String browserType, String webUrl) {
        try {
            // khởi tạo driver và browser
            setDriver(browserType, webUrl);
        } catch (Exception e) {
            System.out.println("Error ..." + e.getStackTrace());
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
