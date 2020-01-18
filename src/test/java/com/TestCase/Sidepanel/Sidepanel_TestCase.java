package com.TestCase.Sidepanel;

import com.PageObject.Sidepanel.Sidepanel_Report;
import org.testng.annotations.Test;

public class Sidepanel_TestCase {
    Sidepanel_Report sidepanel_report = new Sidepanel_Report();

    @Test(priority = 8)
    public void Details()throws Exception{
        sidepanel_report.Report_Sidepanel();
        sidepanel_report.Hyperlink_Patient_Profile_Age();
        sidepanel_report.Hyperlink_Categry();
    }
}
