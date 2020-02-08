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

        Thread.sleep(10000);

        //SRP Tab Hit
        TestBase.byXpath("SPR").click();
        Thread.sleep(5000);

        //Patient_Profile_Age_Xpath
        TestBase.byXpath("Patient_Profile_Age_Xpath").click();
        Thread.sleep(5000);
        System.out.println("Patient_Profile_Age_Xpath click");

        //Patient_Profile_Age_Categry>Brnd_(C) click
        TestBase.byXpath("Patient_Profile_Age_Categry>Brnd_(C)").click();
        System.out.println("Patient_Profile_Age_Categry>Brnd_(C) click");
        Thread.sleep(15000);

        Boolean Accept = driver.findElements(By.xpath("AcceptUpdate")).size()>0;
        System.out.println(Accept);
        if(Accept == true){
            TestBase.byXpath("AcceptUpdate").click();
            Thread.sleep(10000);
            System.out.println("Update Format");

        }
        else {TestBase.byXpath("Clear_all_xpath").click();
        Thread.sleep(5000);
        System.out.println("Clearall button click");
        }
        Thread.sleep(5000);
        //Speciality choice
        TestBase.byXpath("Speciality").click();
        System.out.println("Speciality choice");
        Thread.sleep(5000);
        //Choice component
        TestBase.byXpath("CHEST").click();
        System.out.println("CHEST click");
        Thread.sleep(15000);


        //Close_Speciality_window
        TestBase.byXpath("Speciality").click();
        System.out.println("Close_Speciality_window");
        Thread.sleep(5000);


        //Selection Period (Radio Button)
        TestBase.byXpath("QTR_Xpath").click();
        Thread.sleep(5000);
        System.out.println("Selection Period (Radio Button)");
        Thread.sleep(5000);


        //Selection Qtr  droupdown click
        TestBase.byXpath("Selected_Year_Xpath").click();
        System.out.println("Selection Period droupdown box click");
        Thread.sleep(5000);


        //Year Choice
        TestBase.byXpath("Mar_June_2019").click();
        System.out.println("Year Choice");
        Thread.sleep(15000);


        //Close Year  droupdown click
        TestBase.byXpath("Selected_Year_Xpath").click();
        System.out.println("Close Year  droupdown click");
        Thread.sleep(5000);

        //Category Droupdown click
        TestBase.byXpath("Category_Xpath").click();
        System.out.println("Category Droupdown click");
        Thread.sleep(5000);

        //Category_choice
        TestBase.byXpath("Category_choice_xpath").click();
        System.out.println("Category_choice");
        Thread.sleep(5000);

        //Close Category Droupdown click
        TestBase.byXpath("Category_Xpath").click();
        System.out.println("Close Category Droupdown click");
        Thread.sleep(10000);


        // Filter Molecule button click
        TestBase.byXpath("Filter_Molecule_Xpath").click();
        System.out.println("Filter Molecule button click");
        Thread.sleep(25000);

        // Molecule droupdownbox click
        TestBase.byXpath("Molecule_Droupdown_box").click();
        System.out.println("Molecule droupdownbox click");
        Thread.sleep(5000);

        // Molecule Value component choice
        TestBase.byXpath("Choice_Molecule").click();
        System.out.println("Molecule Value component choice");
        Thread.sleep(5000);

        // Close Molecule droupdownbox click
        TestBase.byXpath("Molecule_Droupdown_box").click();
        System.out.println("Close Molecule droupdownbox click");
        Thread.sleep(5000);

        //Filter_Brand_Xpath Button click
        TestBase.byXpath("Filter_Brand_Xpath").click();
        System.out.println("Filter_Brand_Xpath Button click");
        Thread.sleep(25000);

        System.out.println("Scroll hit");
        WebElement element = TestBase.byXpath("Generate_Report_Xpath");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        System.out.println("Scroll");
        Thread.sleep(5000);

        //Brand_Droupdown_xpath Droupdown
        TestBase.byXpath("Brand_Droupdown_xpath").click();
        System.out.println("Brand_Droupdown_xpath Droupdown");
        Thread.sleep(5000);

        //Search_Brand_Component
        TestBase.byXpath("Search_Brand_Component").click();
        TestBase.byXpath("Search_Brand_Component_2").click();
        System.out.println("Search_Brand_Component");
        Thread.sleep(5000);

        //Close Brand_Droupdown_xpath Droupdown
        TestBase.byXpath("Brand_Droupdown_xpath").click();
        System.out.println("Close Brand_Droupdown_xpath Droupdown");
        Thread.sleep(5000);

        //Category_brand_custom_Brand_xpath
        TestBase.byXpath("Category_brand_custom_Brand_xpath").click();
        System.out.println("Category_brand_custom_Brand_xpath");
        Thread.sleep(5000);

        //

        //Category_brand_custom_All_Zone
        TestBase.byXpath("Category_brand_custom_All_Zone").click();
        System.out.println("Category_brand_custom_All_Zone");
        Thread.sleep(10000);

        //Custom Age Group TextBox
        TestBase.byXpath("From_Xpath").sendKeys(TestData.getProperty("From_Value"));
        System.out.println("Custom Age From TextBox");
        Thread.sleep(5000);

        TestBase.byXpath("To_Xpath").sendKeys(TestData.getProperty("To_Value"));
        System.out.println("Custom Age TO TextBox");
        Thread.sleep(5000);

        //Generate Report Button Click
        TestBase.byXpath("Generate_Report_Xpath").click();
        System.out.println("Generate Report Button Click");
        Thread.sleep(15000);

        System.out.println("Scroll hit");
        WebElement element1 = TestBase.byXpath("SPR");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        System.out.println("Scroll");
        Thread.sleep(5000);


        System.out.println("Hit Save button ");
        //Save button Click
        TestBase.byXpath("Save_Logo").click();
        System.out.println("Save button Click");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(15000);



    }
}
