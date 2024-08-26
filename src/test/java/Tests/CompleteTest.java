package Tests;

import Pages.CompletePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompleteTest extends BaseTest{
    CompletePage completePage;


    @Test
    public void completeTest(){
        completePage = new CompletePage(driver);
        String ComplteMesg = completePage.ThankYou();
        Assert.assertEquals(ComplteMesg, "Thank you for your order!");
        System.out.println("All Process Done : "+ComplteMesg);

    }
}
