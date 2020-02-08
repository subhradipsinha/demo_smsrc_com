package com.PageObject.PDPC;

import com.demo.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author Subhradip sinha
 * Date: 11/01/2020
 */
public class Cat_BrdMol_Mol_Brnd_SKU_PAT_Set1_Report extends TestBase {
    public void Details()throws Exception{

        //SPR Tab hit
        TestBase.byXpath("SPR").click();
        System.out.println("Spr tab hit");
        Thread.sleep(5000);
        //PDPC Tab Hit
        TestBase.byXpath("PDPC").click();
        System.out.println("PDPC Tab click");
        Thread.sleep(5000);

        //Cat_BrdMol_Mol_Brnd_SKU_PAT_Set1 Tab Hit
        TestBase.byXpath("Cat_BrdMol_Mol_Brnd_SKU_PAT_Set1").click();
        System.out.println("Cat_BrdMol_Mol_Brnd_SKU_PAT_Set1");
        Thread.sleep(15000);


        //Clear all Button Show
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='clear-all']"))).isDisplayed();
        System.out.println("Clear all Button Show");
        Thread.sleep(5000);

        // Clear all
        TestBase.byXpath("Clear_all_xpath").click();
        Thread.sleep(25000);

        //Speciality choice
        TestBase.byXpath("Speciality").click();
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


        //Selection Year  droupdown click
        TestBase.byXpath("Selected_Year_Xpath").click();
        System.out.println("Selection Period droupdown box click");
        Thread.sleep(5000);


        //Qtr Choice
        TestBase.byXpath("Mar_June_2019").click();
        System.out.println("Qtr Choice");
        Thread.sleep(10000);


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


        //Filter Molecule Click
        TestBase.byXpath("Filter_Molecule_Xpath").click();
        System.out.println("Filter Molecule Button click");
        Thread.sleep(5000);



        System.out.println("Scroll hit");
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
       // robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

        WebElement element = TestBase.byXpath("Filter_Brand_Xpath");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        System.out.println("Scroll");
        Thread.sleep(5000);

        // Molecule Droupdown
        TestBase.byXpath("Molecule_Droupdown_box").click();
        System.out.println("Molecule Droupdown");
        Thread.sleep(5000);

        //Molecule Component
        TestBase.byXpath("Choice_Molecule").click();
        System.out.println("Molecule Component");
        Thread.sleep(5000);
        //Close Molecule Droupdown
        TestBase.byXpath("Molecule_Droupdown_box").click();
        System.out.println("Close Molecule droupdown");
        Thread.sleep(5000);

        // Filter Brand Button Click
        TestBase.byXpath("Filter_Brand_Xpath").click();
        Thread.sleep(5000);
        System.out.println("Filter Brand Button Click");

        // Brand Droupdown Click
        TestBase.byXpath("Brand_Xpath").click();
        Thread.sleep(5000);
        System.out.println("Brand Droupdown Click");
        // Brand component choice
        TestBase.byXpath("Priority_component_choice").click();
        Thread.sleep(5000);
        System.out.println("Brand_Component");

        //Close Droupdown
        TestBase.byXpath("Brand_Xpath").click();
        Thread.sleep(5000);
        System.out.println("Close Brand Droupdown");

        // Filter Strength
        TestBase.byXpath("Filter_Strength").click();
        Thread.sleep(5000);
        System.out.println("Filter_Strength Button click");

        //Strength Droupdown box
        TestBase.byXpath("Strength_Droupdown").click();
        Thread.sleep(5000);
        System.out.println("Strength_Droupdown Button Click");
        //Strength component Choice
        TestBase.byXpath("Strength_component").click();
        System.out.println("Strength component Choice");
        Thread.sleep(5000);
        //Close Strength Droupdown
        TestBase.byXpath("Strength_Droupdown").click();
        System.out.println("Close Strength Droupdown");
        Thread.sleep(5000);

        //Filter PdSet1 Button click
        TestBase.byXpath("Filter_PdSet1_Button").click();
        System.out.println("Filter_PdSet1_Button_click");
        Thread.sleep(10000);

        //PdSet1 Droupdown click
        TestBase.byXpath("PdSet1_Droupdown").click();
        System.out.println("PdSet1 Droupdown click");
        Thread.sleep(5000);
        //PdSet1 component
        TestBase.byXpath("PdSet1_component").click();
        TestBase.byXpath("PdSet1_component1").click();
        TestBase.byXpath("PdSet1_component2").click();
        System.out.println("PdSet1 component");
        Thread.sleep(10000);
        // Close PdSet1 Droupdown click
        TestBase.byXpath("PdSet1_Droupdown").click();
        System.out.println("Close PdSet1 Droupdown click");
        Thread.sleep(5000);

        //Zone droupdown
        TestBase.byXpath("Dosage_And_Duration_Zone_Xpath").click();
        System.out.println("Zone droupdown");
        Thread.sleep(5000);
        //Choice value
        TestBase.byXpath("Dosage_And_Duration_All_Zone_Xpath").click();
        System.out.println("Choice value");
        Thread.sleep(10000);

        // Close Zone
        TestBase.byXpath("Dosage_And_Duration_Zone_Xpath").click();
        System.out.println("Close Zone");
        Thread.sleep(5000);

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
        Thread.sleep(25000);

        System.out.println("Scroll hit");
        WebElement element1 = TestBase.byXpath("SPR");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        System.out.println("Scroll");
        Thread.sleep(5000);


        System.out.println("Hit Save button ");
        //Save button Click
        TestBase.byXpath("Save_Logo").click();
        System.out.println("Save button Click");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(15000);


    }
}
