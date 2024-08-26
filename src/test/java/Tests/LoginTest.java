package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest extends BaseTest{
    LoginPage loginPage;
    HomePage homePage;


    @Test
    public void loginTest(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

        loginPage.LoginProcess();
        String Actual = homePage.logoutButtonVisibility();
        System.out.println(Actual);
        String expected = "We Are In HomePage";
        Assert.assertEquals(Actual,expected);

    }
}
