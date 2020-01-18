package com.PageObject.RXER_Profile_Age;

import com.demo.TestBase;

public class RXER_Profile_Age_Brand extends TestBase {
    public void RXER_Profile_Age_Brand_Details()throws Exception{
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
        Thread.sleep(3000);

    }
}
