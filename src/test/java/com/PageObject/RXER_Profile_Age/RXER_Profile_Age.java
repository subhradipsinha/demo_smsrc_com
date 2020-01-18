package com.PageObject.RXER_Profile_Age;

import com.demo.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RXER_Profile_Age extends TestBase {
    @Test
    public void RXER_Profile_Age_Details() throws Exception {
        Thread.sleep(5000);

        //SRP Tab Hit
        TestBase.byXpath("SPR_Xpath").click();
        Thread.sleep(5000);
        //RXER_Profile_Age Tab click
        TestBase.byXpath("RXER_Profile_Age_Xpath").click();
        System.out.println("RXER_Profile_Age Tab click");
        Thread.sleep(5000);

        //Brand Hit
        TestBase.byXpath("Brand_Xpath").click();
        System.out.println("Brand Hit");
        Thread.sleep(5000);


        //Slider Tab Click
        TestBase.byXpath("Slider_Xpath_Tab").click();
        Thread.sleep(15000);
    }

    @Test
    public void RXER_Profile_Age_From() throws Exception {
        // Clear all
        TestBase.byXpath("Clear_all_xpath").click();
        Thread.sleep(5000);

        //Speciality choice
        TestBase.byXpath("Speciality").click();
        Thread.sleep(2000);
        //Choice component
        TestBase.byXpath("CARDIO").click();
        System.out.println("CHEST click");
        Thread.sleep(5000);


        //Close_Speciality_window
        TestBase.byXpath("Speciality").click();
        System.out.println("Close_Speciality_window");
        Thread.sleep(3000);


        //Selection Period (Radio Button)
        TestBase.byXpath("QTR_Xpath").click();
        Thread.sleep(3000);
        System.out.println("Selection Period (Radio Button)");
        Thread.sleep(3000);


        //Selection Year  droupdown click
        TestBase.byXpath("Selected_Year_Xpath").click();
        System.out.println("Selection Period droupdown box click");
        Thread.sleep(3000);


        //Year Choice
        TestBase.byXpath("Mar_June_2019").click();
        System.out.println("Year Choice");
        Thread.sleep(5000);


        //Close Year  droupdown click
        TestBase.byXpath("Selected_Year_Xpath").click();
        System.out.println("Close Year  droupdown click");
        Thread.sleep(5000);

        System.out.println("Scroll hit");
        WebElement element = TestBase.byXpath("Generate_Report_Xpath");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        System.out.println("Scroll");
        Thread.sleep(5000);

        //Search Brand
        TestBase.byXpath("Search_Brand_Xpath").click();
        Thread.sleep(5000);
        System.out.println("Search Brand");

        //Choice Brand
        TestBase.byXpath("Brand_Choice_Xpath").click();
        Thread.sleep(3000);
        System.out.println("Brand_Choice_Xpath");

        //Close Brand
        TestBase.byXpath("QTR_Xpath").click();
        Thread.sleep(5000);
        System.out.println("Close Brand");

        //Zone droupdown
        TestBase.byXpath("Zone_Xpath").click();
        System.out.println("Zone droupdown");
        Thread.sleep(3000);
        //Choice value
        TestBase.byXpath("North_Xpath").click();
        System.out.println("Choice value");
        Thread.sleep(3000);

        // Close Zone
        TestBase.byXpath("Zone_Xpath").click();
        System.out.println("Close Zone");
        Thread.sleep(3000);

        //Generate Report Button Click
        TestBase.byXpath("Generate_Report_Xpath").click();
        System.out.println("Generate Report Button Click");
        Thread.sleep(15000);

        System.out.println("Scroll hit");
        WebElement element1 = TestBase.byXpath("Chart_View");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        System.out.println("Scroll");
        Thread.sleep(5000);


        System.out.println("Hit Save button ");
        //Save button Click
        TestBase.byXpath("Save_Logo").click();
        System.out.println("Save button Click");
        Thread.sleep(5000);
    }
}