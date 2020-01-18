package com.TestCase.Categry_Mol;

import com.PageObject.Categry_Mol_S.Categry_Mol_S;
import org.testng.annotations.Test;

public class Categry_Mol_S_TestCase {
    Categry_Mol_S categry_mol_s = new Categry_Mol_S();

    @Test(priority = 9)
    public void Categry_Mol() throws Exception {
        categry_mol_s.Details();
    }

}
