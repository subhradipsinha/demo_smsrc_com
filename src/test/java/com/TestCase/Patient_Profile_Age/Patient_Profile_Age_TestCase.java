package com.TestCase.Patient_Profile_Age;

import com.PageObject.Patient_Profile_Age.Patient_Profile_Age;
import org.testng.annotations.Test;

/**
 * @Author Subhradip sinha
 * @start Date: 10-01-2020
 *
 */
public class Patient_Profile_Age_TestCase {
    Patient_Profile_Age patient_profile_age = new Patient_Profile_Age();

    @Test(priority = 6)
    public void Hyperlink_Patient_Profile() throws Exception {

       patient_profile_age.Hyperlink_Patient_Profile_Age();
       patient_profile_age.Categry_Brnd_HyperLink();
    }
}
