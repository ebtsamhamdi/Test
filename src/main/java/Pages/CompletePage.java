package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage extends BasePage {
    public CompletePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "complete-header")
    WebElement thankYou;

    public String ThankYou() {
    return thankYou.getText();
    }
}
