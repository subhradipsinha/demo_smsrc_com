package com.PageObject.LoginPage;

import com.demo.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Author Subhradip sinha
 * @start Date: 09-01-2020
 *
 */
public class Login extends TestBase {
    @Test
    public void init() throws Exception {
        // Call URL Hit
        TestBase.initilize();
    }
    @Test
    public void UserName()throws Exception {

        WebElement username = TestBase.byXpath("UserName_Xpath");
        if(username.isEnabled()){
        // Email ID Given
        TestBase.byXpath("UserName_Xpath").sendKeys(TestData.getProperty("UserName"));
        System.out.println("UserName Enter");
        Thread.sleep(2000);}
        else {
            System.out.println("UserName not Enter");
        }

        WebElement login = TestBase.byXpath("Log_In_Xpath");
        if(login.isEnabled()){
        // Click Login button
        TestBase.byXpath("Log_In_Xpath").click();
        System.out.println("Login Button show");
        Thread.sleep(2000);}
        else {
            System.out.println("Login Button not show");
        }

        //Clear Email Filled
        TestBase.byXpath("UserName_Xpath").clear();
        // Refresh Total page
        driver.navigate().refresh();
        Thread.sleep(5000);
        System.out.println("UserName Test 1 complete");


        // Apply for condition
        Boolean isPresent = driver.findElements(By.id("DashBoard")).size()>0;

        if (isPresent == true) {
            System.out.println("Successfully Dashboard show List");
        } else {
            System.out.println("Not show Dashboard show List");
            Assert.assertTrue(isPresent, "WithOut Password Successfully login...==");
        }

    }
    @Test
    public void Password_Data()throws Exception{

        WebElement password = TestBase.byXpath("Password_Xpath");
        if(password.isEnabled()){
        //Password Given
        TestBase.byXpath("Password_Xpath").sendKeys(TestData.getProperty("Password"));
            System.out.println("Password Text-box click");
            Thread.sleep(2000);}
        else {
            System.out.println("Password Text-box not show");
        }


        // Click Login Button
        WebElement login = TestBase.byXpath("Log_In_Xpath");
        if(login.isEnabled()){
            // Click Login button
            TestBase.byXpath("Log_In_Xpath").click();
            System.out.println("Login Button show");
            Thread.sleep(2000);}
        else {
            System.out.println("Login Button not show");
        }

        //Clear Password filled
        TestBase.byXpath("Password_Xpath").clear();
        // refresh Total Page
        driver.navigate().refresh();
        Thread.sleep(5000);
        System.out.println("Password_Data Test 2 complete");

        // Apply for condition
        Boolean isPresent = driver.findElements(By.id("DashBoard")).size()>0;

        if (isPresent == true) {
            System.out.println("Successfully Dashboard show List");
        } else {
            System.out.println("Not show Dashboard show List");
            Assert.assertTrue(isPresent, "WithOut UserName Successfully login...==");
        }
    }
    @Test
    public void LogIn()throws Exception{
        WebElement username = TestBase.byXpath("UserName_Xpath");
        if(username.isEnabled()){
            // Email ID Given
            TestBase.byXpath("UserName_Xpath").sendKeys(TestData.getProperty("UserName"));
            System.out.println("UserName Enter");
            Thread.sleep(2000);}
        else {
            System.out.println("UserName not Enter");
        }

        WebElement password = TestBase.byXpath("Password_Xpath");
        if(password.isEnabled()){
            //Password Given
            TestBase.byXpath("Password_Xpath").sendKeys(TestData.getProperty("Password"));
            System.out.println("Password Text-box click");
            Thread.sleep(2000);}
        else {
            System.out.println("Password Text-box not show");
        }

        // Click Login Button
        WebElement login = TestBase.byXpath("Log_In_Xpath");
        if(login.isEnabled()){
            // Click Login button
            TestBase.byXpath("Log_In_Xpath").click();
            System.out.println("Login Button show");
            Thread.sleep(2000);}
        else {
            System.out.println("Login Button not show");
        }

        // Apply for condition
        Boolean isPresent = driver.findElements(By.name("DashBoard")).size()>0;
        if (isPresent == true) {
            System.out.println("Successfully Dashboard show List");
        } else {
            System.out.println("Not show Dashboard show List");
            // Assert.assertTrue(isPresent, "With UserName & Password Successfully login==");
            Assert.assertEquals(isPresent,isPresent,"With UserName & Password Successfully login==");
        }
    }
    @Test
    public void Quite(){
        System.out.println("LogOut Successfully");
    }

}
