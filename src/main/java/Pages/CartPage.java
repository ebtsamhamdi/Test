package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
public CartPage(WebDriver driver) {
   super(driver);
}

@FindBy(linkText = "Sauce Labs Backpack")
WebElement itemName;

@FindBy(linkText = "Sauce Labs Fleece Jacket")
WebElement itemName2;

@FindBy (id = "checkout")
WebElement checkout;

public String Itemdisplay(){
    return itemName.getText();
}

public String Itemdisplay2(){
    return itemName2.getText();
}

public void clickCheckout() {
    checkout.click();
}
}
