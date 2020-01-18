package com.PageObject.Patient_Profile_Age;

import com.demo.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Author Subhradip sinha
 * @start Date: 09-01-2020
 *
 */
public class Patient_Profile_Age extends TestBase {
    @Test
    public void Hyperlink_Patient_Profile_Age() throws Exception {
        Thread.sleep(5000);
        TestBase.byXpath("Patient_Profile_Age_Xpath").click();
        Thread.sleep(2000);
        System.out.println("Patient_Profile_Age_Xpath click");

    }
    @Test
    public void Categry_Brnd_HyperLink() throws Exception {
        TestBase.byXpath("Patient_Profile_Age_Categry>Brnd_(C)").click();
        Thread.sleep(2000);
        System.out.println("Patient_Profile_Age_Xpath click");
        Thread.sleep(8000);

    }





}
