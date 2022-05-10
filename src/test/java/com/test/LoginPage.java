package com.test;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginPage extends BassClass {

    @Test
    public void TC01 () {
        System.out.println("This is  test case 01");
    }

    @Test
    public void TC02 () {
        System.out.println("This is  test case 02");
    }

    @Test
    public void TC03 () {
        System.out.println("This is  test case 03");
    }

    @Test
    public void TC04 () {
        throw new SkipException("Skip this test case");
        //System.out.println("This is  test case 04");
    }
}
