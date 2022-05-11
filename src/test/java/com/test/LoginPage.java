package com.test;

import com.base.ultilities.Log;
import io.qameta.allure.*;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginPage extends BassClass {

    @Description("Verify home page title")
    @Story("Test verify base page title")
    @Test
    public void TC01 () {
        Log.info("Đây là log info - TC01");
        System.out.println("This is  test case 01");
    }

    @Step("Step 02 - This is test case 2")
    @Description("Step 02 - This is test case 2")
    @Test
    public void TC02 () {
        Log.info("Đây là log info - TC02");
        System.out.println("This is  test case 02");
    }

    @Step("Step 03 - This is test case 3")
    @Description("Step 03 - This is test case 3")
    @Test
    public void TC03 () {
        Log.info("Đây là log info - TC03");
        System.out.println("This is  test case 03");
    }

    @Step("Step 04 - This is test case 4")
    @Description("Step 04 - This is test case 4")
    @Test
    public void TC04 () {
        Log.info("Đây là log info - TC04");
        throw new SkipException("Skip this test case");
        //System.out.println("This is  test case 04");
    }

    @Step("Step 05 - This is test case 5")
    @Test
    public void TC05 () {
//        throw new SkipException("Skip this test case");
        Log.info("Đây là log info - TC05");
        System.out.println("This is  test case 05");
    }
}
