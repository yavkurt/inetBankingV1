package com.inetbanking.testCases;

import com.inetbanking.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void LoginTest (){

        driver.get(baseUrl);
        logger.info("URL is opened!");
        LoginPage lp =new LoginPage(driver);
        lp.setUserName(username);
        logger.info("User name entered!");
        lp.setPassword(password);
        logger.info("Password entered!");
        lp.clickSubmit();
        logger.info("Submitted!");

        if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
            logger.info("Login Test passed!");
        }else{
            Assert.assertTrue(false);
            logger.info("Test Failed!");
        }


    }
}
