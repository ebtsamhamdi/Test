package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="user-name")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginButton;


    public void LoginProcess(){
    username.sendKeys("standard_user");
    password.sendKeys("secret_sauce");
    loginButton.click();
    }
}





