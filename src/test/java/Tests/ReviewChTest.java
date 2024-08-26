package Tests;

import Pages.ReviewChPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewChTest extends BaseTest{
    ReviewChPage reviewChPage;

    @Test
    public void ReviewChTest(){
        reviewChPage = new ReviewChPage(driver);
        String ReviewURL = driver.getCurrentUrl();
        Assert.assertEquals(ReviewURL,"https://www.saucedemo.com/checkout-step-two.html");
        System.out.println("Current URL: " + ReviewURL);
        reviewChPage.clickFinish();

    }
}
