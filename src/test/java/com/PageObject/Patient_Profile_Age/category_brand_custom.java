package com.PageObject.Patient_Profile_Age;

import com.demo.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.xml.bind.SchemaOutputResolver;
import java.util.concurrent.TimeUnit;

/**
 * @author Subhradip sinha
 * Date: 13/01/2020
 */

public class category_brand_custom extends TestBase {
    @Test
    public void brand_custom()throws Exception{

        Thread.sleep(5000);
        // Clear all
        TestBase.byXpath("Clear_all_xpath").click();
        Thread.sleep(5000);

        //Speciality choice
        TestBase.byXpath("Speciality").click();
        Thread.sleep(2000);
        //Choice component
        TestBase.byXpath("CHEST").click();
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

        //Category Droupdown click
        TestBase.byXpath("Category_Xpath").click();
        System.out.println("Category Droupdown click");
        Thread.sleep(3000);

        //Category_choice
        TestBase.byXpath("Category_choice_xpath").click();
        System.out.println("Category_choice");
        Thread.sleep(5000);

        //Close Category Droupdown click
        TestBase.byXpath("Category_Xpath").click();
        System.out.println("Close Category Droupdown click");
        Thread.sleep(10000);


        //Filter Brand Button Click
        TestBase.byXpath("Filter_Brand_Xpath").click();
        System.out.println("Filter Brand Button click");
        Thread.sleep(10000);

        System.out.println("Scroll hit");
        WebElement element = TestBase.byXpath("Generate_Report_Xpath");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        System.out.println("Scroll");
        Thread.sleep(10000);

        //Molecule Droupdownbox
        TestBase.byXpath("Molecule_Droupdown_box").click();
        System.out.println("Molecule Droupdownbox");
        Thread.sleep(5000);

        // Choice Molecule
        TestBase.byXpath("Choice_Molecule").click();
        System.out.println("Choice Molecule");
        Thread.sleep(5000);
        //Close Molecule Droupdownbox
        TestBase.byXpath("Molecule_Droupdown_box").click();
        System.out.println("Close Molecule Droupdownbox");
        Thread.sleep(5000);

        //Brand Button Click
        TestBase.byXpath("Brand_Button_Click").click();
        Thread.sleep(2000);
        System.out.println("Brand Button Click");

        //Brand Droupdown click
        TestBase.byXpath("Brand_droupdown_xpath").click();
        Thread.sleep(3000);
        System.out.println("Brand Droupdown click");

        //Choice Brand
        TestBase.byXpath("Choise_Brand").click();
        Thread.sleep(5000);
        System.out.println("Choice Brand");

        //Close Brand
        TestBase.byXpath("Brand_droupdown_xpath").click();
        System.out.println("Close Brand_droupdown_xpath");
        Thread.sleep(15000);

        //Zone droupdown
        TestBase.byXpath("Zone_Xpath").click();
        System.out.println("Zone droupdown");
        Thread.sleep(5000);

        //Choice value
        TestBase.byXpath("North_Xpath").click();
        System.out.println("Choice value");
        Thread.sleep(5000);

        // Close Zone
        TestBase.byXpath("Zone_Xpath").click();
        System.out.println("Close Zone");
        Thread.sleep(5000);

        //Custom Age Group TextBox
        TestBase.byXpath("From_Xpath").sendKeys(TestData.getProperty("From_Value"));
        System.out.println("Custom Age From TextBox");
        Thread.sleep(2000);

        TestBase.byXpath("To_Xpath").sendKeys(TestData.getProperty("To_Value"));
        System.out.println("Custom Age TO TextBox");
        Thread.sleep(2000);

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
        Thread.sleep(10000);


    }
}
