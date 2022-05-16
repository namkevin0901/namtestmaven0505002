package com.pages;

import com.base.ultilities.Log;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    private WebDriver driver; // driver của class LoginPage

    private By username = By.cssSelector("#user-name");
    private By password = By.cssSelector("#password");
    private By loginbutton = By.cssSelector("#login-button");

    // Khởi tạo class khi được gọi và truyền driver vào
    // để các thành phần trong class này đọc
    // hàm xây dựng => contractor => lấy tên trùng tên class
    // hàm xây dựng này khởi tạo driver
    // nhận giá trị khởi tạo từ bên ngoài
    // mỗi class cần khởi tạo hàm xây dựng
    // cái này quan trọng
    // nguyên tắc để kế thừa trong OOP
    public LoginPage (WebDriver driver) { // driver được truyền vào từ chổ khác khởi tạo => cụ thể là thằng BaseSetup
        this.driver = driver; // driver BaseSetup sẽ được truyền vào driver này, driver chổ này sẽ nhận driver của BaseSetup
    } // driver này sẽ truyền cho driver phía trên và sử dụng cho cả hàm này

    public void SignIn (String username_input, String password_input) {
        InputUsername(username_input);
        InputPassword(password_input);
        ClickButtonLogin();
    }

    public void InputUsername (String username_input) {
        WebElement clickfieldusername = driver.findElement(username);
        Assert.assertTrue(clickfieldusername.isDisplayed(),"Field username không hiển thị");
        clickfieldusername.click();
        clickfieldusername.clear();
        clickfieldusername.sendKeys(username_input);
    }

    public void InputPassword (String password_input) {
        WebElement clickonfieldpassword = driver.findElement(password);
        Assert.assertTrue(clickonfieldpassword.isDisplayed(),"Field password không hiển thị");
        clickonfieldpassword.click();
        clickonfieldpassword.clear();
        clickonfieldpassword.sendKeys(password_input);
    }

    public void ClickButtonLogin () {
        WebElement clickonbuttonlogin = driver.findElement(loginbutton);
        Assert.assertTrue(clickonbuttonlogin.isDisplayed(),"Button Login không hiển thị");
        clickonbuttonlogin.click();
    }

}
