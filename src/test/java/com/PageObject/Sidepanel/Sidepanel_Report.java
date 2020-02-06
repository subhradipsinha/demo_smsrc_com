package com.PageObject.Sidepanel;

import com.demo.TestBase;
import org.omg.IOP.TAG_JAVA_CODEBASE;
import org.testng.annotations.Test;

public class Sidepanel_Report extends TestBase {
    @Test
    public void Report_Sidepanel()throws Exception{
        Thread.sleep(5000);
        //SPR HIT SIDE PANEL
        TestBase.byXpath("SPR").click();
        System.out.println("SPR SIDE PANEL");
        Thread.sleep(3000);
    }
    @Test
    public void Hyperlink_Patient_Profile_Age() throws Exception {
        Thread.sleep(5000);
        TestBase.byXpath("SidePanel_Patient_Profile_Age_Xpath").click();
        System.out.println("SidePanel_Patient_Profile_Age_Xpath click");
        Thread.sleep(5000);

    }
    @Test
    public void Hyperlink_Categry()throws Exception{
        TestBase.byXpath("Categry_Mol_S").click();
        Thread.sleep(5000);
        System.out.println("Hyperlink_Categry()");
    }
    }
