package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewChPage extends BasePage {
    public ReviewChPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "finish")
    WebElement finish;



public void clickFinish() {
    finish.click();
}
}

