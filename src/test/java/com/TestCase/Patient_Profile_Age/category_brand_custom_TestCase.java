package com.TestCase.Patient_Profile_Age;


import com.PageObject.Patient_Profile_Age.category_brand_custom;
import org.testng.annotations.Test;

/**
 * @Author Subhradip sinha
 * @start Date: 10-01-2020
 *
 */

public class category_brand_custom_TestCase {
    category_brand_custom categoryBrandCustom = new category_brand_custom();
    @Test(priority = 6)
    public void brand_custom_TestCase()throws Exception{
        categoryBrandCustom.brand_custom();
    }
}