package com.TestCase.RXER_Profile_Age_Report;

import com.PageObject.RXER_Profile_Age.RXER_Profile_Age;
import org.testng.annotations.Test;

public class RXER_Profile_Age_TestCase {
    RXER_Profile_Age rxer_profile_age = new RXER_Profile_Age();

    @Test(priority = 10)
    public void details()throws Exception{
        rxer_profile_age.RXER_Profile_Age_Details();
        rxer_profile_age.RXER_Profile_Age_From();
    }

}
