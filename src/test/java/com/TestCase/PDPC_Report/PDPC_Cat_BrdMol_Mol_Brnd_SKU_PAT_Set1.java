package com.TestCase.PDPC_Report;

import com.PageObject.PDPC.Cat_BrdMol_Mol_Brnd_SKU_PAT_Set1_Report;
import org.testng.annotations.Test;

public class PDPC_Cat_BrdMol_Mol_Brnd_SKU_PAT_Set1 {
    Cat_BrdMol_Mol_Brnd_SKU_PAT_Set1_Report cat_brdMol_mol_brnd_sku_pat_set1_report = new Cat_BrdMol_Mol_Brnd_SKU_PAT_Set1_Report();

    @Test(priority = 9)
    public void Categry_Mol() throws Exception {
        cat_brdMol_mol_brnd_sku_pat_set1_report.Details();
    }

}
