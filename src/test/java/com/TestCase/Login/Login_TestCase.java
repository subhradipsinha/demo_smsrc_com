package com.TestCase.Login;

import com.PageObject.LoginPage.Login;
import org.testng.annotations.Test;

/**
 * @Author Subhradip sinha
 * @start Date: 10-01-2020
 *
 */

    @Test(priority = 1)
public class Login_TestCase {
   public static Login login = new Login();
    @Test(priority = 2)
    public void Url_Hit()throws Exception{
        login.init();
    }
    @Test(priority = 3)
    public void Without_Password()throws Exception{
        login.UserName();
    }
    @Test(priority = 4)
    public void Without_UserName()throws Exception{
        login.Password_Data();
    }
    @Test(priority = 5)
    public void With_Username_Password()throws Exception{
        login.LogIn();
    }
}
