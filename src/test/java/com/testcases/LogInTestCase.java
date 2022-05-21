package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bases.BassClass;
import com.pages.LoginPage;

public class LogInTestCase extends BassClass {

    private WebDriver driver;
    // một cách khác để kế thừa
    // khởi tạo 1 đối tượng
    public LoginPage loginPage;

    String userstandard = "standard_user";
    String passwordstandard = "secret_sauce";

    @BeforeMethod
    public void setUp () {
        // đã khởi tạo browser
        driver = getDriver();
    }

    @Test
    public void LogInSuccess2 () {
        System.out.println(driver);
        // nguyên tắc để kế thừa trong OOP
        // cái này quan trọng
        loginPage = new LoginPage(driver);
        loginPage.SignIn(userstandard, passwordstandard);
    }

    @Test
    public void LogInSuccess () {
        System.out.println(driver);
        // nguyên tắc để kế thừa trong OOP
        // cái này quan trọng
        loginPage = new LoginPage(driver);
        loginPage.SignIn(userstandard, passwordstandard);
    }
}
