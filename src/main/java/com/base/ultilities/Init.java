//package com.base.ultilities;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.WebDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class Init {
//
//    public WebDriver driver;
//
//    @BeforeMethod
//    public void SetUp() {
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(false);
//        driver = new ChromeDriver(options);
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//    }
//
//    @AfterMethod
//    public void TearDown() {
//        driver.quit();
//    }
//
//}
