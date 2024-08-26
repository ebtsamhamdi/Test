package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "app_logo")
    WebElement logo;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart1;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement addToCart2;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    WebElement cartbadge;

    @FindBy(className = "shopping_cart_link")
    WebElement cartlink;

    public String logoutButtonVisibility() {
        if (logo.isDisplayed()) {

            return "We Are In HomePage";
        } else {

            return "We Failed To Be In HomePage";
        }
    }

    public void addToCart() {
        addToCart1.click();
        addToCart2.click();
    }

    public String CartBadgeVisibility() {
        if (cartbadge.isDisplayed()) {
            return "cart Badge is displayed";
        } else {
           return "cart Badge is failed to be displayed";
        }
    }

    public void GotoCart(){
        cartlink.click();
    }
}
