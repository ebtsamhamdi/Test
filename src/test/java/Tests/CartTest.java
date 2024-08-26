package Tests;

import Pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest{
    CartPage cartPage;


    @Test(priority = 1)
    public void testItemDisplay() {
        CartPage cartPage = new CartPage(driver);

        String displayedItemName = cartPage.Itemdisplay();

        Assert.assertEquals(displayedItemName, "Sauce Labs Backpack");

        System.out.println("Displayed Item: " + displayedItemName);
    }

    @Test(priority = 2)
    public void testItemDisplay2() {
        CartPage cartPage = new CartPage(driver);

        String displayedItemName2 = cartPage.Itemdisplay2();

        Assert.assertEquals(displayedItemName2, "Sauce Labs Fleece Jacket");

        System.out.println("Displayed Item 2 : " + displayedItemName2);
    }


    @Test(priority = 3)
    public void CartPageTest() {
    cartPage = new CartPage(driver);
    cartPage.clickCheckout();

}
}