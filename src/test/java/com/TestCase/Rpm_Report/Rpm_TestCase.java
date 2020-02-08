package com.TestCase.Rpm_Report;

import com.PageObject.RPM.Rpm;
import org.testng.annotations.Test;

public class Rpm_TestCase {
    Rpm rpm = new Rpm();
    @Test(priority = 16)
    public void details()throws Exception{
        rpm.Rpm_Tab_Click();
        rpm.RPM_DETAILS();
    }

}
