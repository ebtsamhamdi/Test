package Tests;

import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest {
   HomePage homePage;




    @Test(dependsOnMethods ="Tests.LoginTest.loginTest" )
    public void CartProcess() {
        HomePage homePage = new HomePage(driver);
        homePage.addToCart();
        String Actual = homePage.CartBadgeVisibility();
        System.out.println(Actual);
        String Expected = "cart Badge is displayed";
        Assert.assertEquals(Actual, Expected);
        homePage.GotoCart();
    }
}

