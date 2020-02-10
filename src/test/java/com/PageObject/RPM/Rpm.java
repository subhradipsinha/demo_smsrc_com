package com.PageObject.RPM;

import com.demo.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.sound.midi.Soundbank;

/**
 * @author Subhradip sinha
 * Date : 12/01/2020
 * */

public class Rpm extends TestBase {
    public void Rpm_Tab_Click()throws Exception{

       Thread.sleep(5000);
        //SRP Tab Hit
        TestBase.byXpath("SPR").click();
        Assert.assertEquals("SPR_Xpath" , "SPR_Xpath", " SPR tab show====");
        System.out.println("SRP Tab Hit");
        Thread.sleep(5000);

        //Rpm Tab Click
        TestBase.byXpath("RPM_Xpath").click();
        System.out.println("Rpm Tab Click");
        Thread.sleep(3000);
        //Test_Rpm_Xpath
        TestBase.byXpath("Test_Rpm_Xpath").click();
        System.out.println("Test_Rpm_Xpath Tab Click");
        Thread.sleep(15000);

    }
    public void RPM_DETAILS()throws Exception{
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
        Thread.sleep(20000);

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
        Thread.sleep(3000);


        //Selection Period (Radio Button)
        TestBase.byXpath("QTR_Xpath").click();
        Thread.sleep(5000);
        System.out.println("Selection Period (Radio Button)");


        //Selection Qtr  droupdown click
        TestBase.byXpath("Selected_Year_Xpath").click();
        System.out.println("Selection Period droupdown box click");
        Thread.sleep(5000);


        //Qtr Choice
        TestBase.byXpath("Mar_June_2019").click();
        System.out.println("Qtr Choice");
        Thread.sleep(10000);


        //Close Qtr  droupdown click
        TestBase.byXpath("Selected_Year_Xpath").click();
        System.out.println("Close Qtr  droupdown click");
        Thread.sleep(5000);


        //Company_Droupdown
        TestBase.byXpath("Category_Xpath").click();
        Thread.sleep(5000);
        System.out.println("Company_Droupdown");

        //Choice Company_component
        TestBase.byXpath("Category_choice_xpath").click();
        System.out.println("Choice Company_component");
        Thread.sleep(5000);

        //Close Company_Droupdown
        TestBase.byXpath("Category_Xpath").click();
        Thread.sleep(5000);
        System.out.println("Close Company_Droupdown");

        //Filter Division Button click
        TestBase.byXpath("Filter_Molecule_Xpath").click();
        System.out.println("Filter Division Button click");
        Thread.sleep(35000);



        //Division_Droupdown
        TestBase.byXpath("Molecule_Droupdown_box").click();
        System.out.println("Division_Droupdown");
        Thread.sleep(5000);


        //Choice Division component
        TestBase.byXpath("Choice_Molecule_all_select").click();
        System.out.println("Choice Division component");
        Thread.sleep(5000);

        //Close Division_Droupdown
        TestBase.byXpath("Molecule_Droupdown_box").click();
        System.out.println("Close Division_Droupdown");
        Thread.sleep(5000);


        //Filter priority Button Click
        TestBase.byXpath("Filter_Brand_Xpath").click();
        System.out.println("Filter priority Button Click");
        Thread.sleep(25000);

        System.out.println("Scroll hit");
        WebElement element = TestBase.byXpath("Generate_Report_Xpath");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        System.out.println("Scroll");
        Thread.sleep(5000);

        // Priority Droupdown Box
        TestBase.byXpath("Brand_Droupdown_xpath").click();
        System.out.println("Priority Droupdown Box");
        Thread.sleep(5000);

        // Priority component choice
        TestBase.byXpath("Brand_Component").click();
        TestBase.byXpath("Brand_Component_2").click();
        System.out.println("Priority component choice");
        Thread.sleep(15000);

        // Close Priority Droupdown Box
        TestBase.byXpath("Brand_Droupdown_xpath").click();
        System.out.println("Close Priority Droupdown Box");
        Thread.sleep(5000);

        //Filter Brand Button Click
        TestBase.byXpath("Filter_Strength").click();
        System.out.println("Filter Brand Button Click");
        Thread.sleep(15000);

        //Brand Droupdown Box
        TestBase.byXpath("Brand_Droupdown_xpath").click();
        System.out.println("Brand Droupdown Box");
        Thread.sleep(5000);

        // Brand Component Choice
        TestBase.byXpath("Priority_component_choice").click();
        System.out.println("Brand Component Choice");
        Thread.sleep(5000);

        //Close Brand Droupdown Box
        TestBase.byXpath("Brand_Droupdown_xpath").click();
        System.out.println("Close Brand Droupdown Box");
        Thread.sleep(5000);

        //Zone droupdown
        TestBase.byXpath("RPM_Zone_droupdown").click();
        System.out.println("Zone droupdown");
        Thread.sleep(5000);
        //Choice value
        TestBase.byXpath("RPM_All_Zone").click();
        System.out.println("Choice value");
        Thread.sleep(15000);

        // Close Zone
        TestBase.byXpath("RPM_Zone_droupdown").click();
        System.out.println("Close Zone");
        Thread.sleep(5000);

        // Filter_PLC Button Click
        TestBase.byXpath("Filter_PLC").click();
        System.out.println("Filter_PLC Button Click");
        Thread.sleep(15000);

        //PLC_Droupdown
        TestBase.byXpath("PLC_Droupdown").click();
        System.out.println("PLC_Droupdown");
        Thread.sleep(5000);

        //PLC_Component_Choice
        TestBase.byXpath("PLC_Component_Choice").click();
        System.out.println("PLC_Component_Choice");
        Thread.sleep(15000);

        //close PLC_Droupdown
        TestBase.byXpath("PLC_Droupdown").click();
        System.out.println("close PLC_Droupdown");
        Thread.sleep(5000);

        //Filter_TP_Desc Button Click
        TestBase.byXpath("Filter_TP_Desc").click();
        System.out.println("Filter_TP_Desc Button Click");
        Thread.sleep(15000);

        //Tp_desc Droupdown box
        TestBase.byXpath("Tp_desc").click();
        System.out.println("Tp_desc Droupdown box");
        Thread.sleep(5000);

        //Tp_desc component Choice
        TestBase.byXpath("Tp_desc_component_Choice").click();
        System.out.println("Tp_desc component Choice");
        Thread.sleep(15000);

        //Close Tp_desc Droupdown box
        TestBase.byXpath("Tp_desc").click();
        System.out.println("Close Tp_desc Droupdown box");
        Thread.sleep(5000);

        //Generate Report Button Click
        TestBase.byXpath("Generate_Report_Xpath").click();
        System.out.println("Generate Report Button Click");
        Thread.sleep(35000);

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
