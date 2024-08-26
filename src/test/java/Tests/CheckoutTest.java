package Tests;

import Pages.CheckoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest{
    CheckoutPage checkoutPage;

@Test
public void Data(){
checkoutPage = new CheckoutPage(driver);
String URL = driver.getCurrentUrl();
    Assert.assertEquals(URL,"https://www.saucedemo.com/checkout-step-one.html");
    System.out.println("Current URL: " + URL);
checkoutPage.FillData();
}
}
