package com.PageObject.Categry_Mol_S;

import com.demo.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Subhradip sinha
 * Date: 11/01/2020
 */
public class Categry_Mol_S extends TestBase {
    public void Details()throws Exception{
        //Clear all Button Show
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='clear-all']"))).isDisplayed();
        System.out.println("Clear all Button Show");

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

        System.out.println("Scroll hit");
        WebElement element = TestBase.byXpath("Generate_Report_Xpath");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(5000);
        System.out.println("Scroll");

        //Filter Brand Button Click
        TestBase.byXpath("Filter_Brand_Xpath").click();
        System.out.println("Filter Brand Button click");
        Thread.sleep(5000);

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
        Thread.sleep(10000);

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
