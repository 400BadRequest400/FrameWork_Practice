package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class BestSellerPage extends CommonAPI {

    @FindBy(how = How.XPATH, using = BestSellerButtonXP)
    public WebElement Bestsellerbutton;

    @FindBy(how = How.XPATH,using = BestSellerValidationLINK)
    public WebElement bestsellervalidation;

    @FindBy(how = How.XPATH, using = BabyCSS)
    public WebElement Baby;


    public void setBestsellerbutton(){
        Bestsellerbutton.click();
    }

    public void setBestsellervalidation(){

        String actualResult = "Amazon Best Sellers";
        String expectedResult = "Amazon Best Sellers";
        Assert.assertEquals(actualResult,expectedResult,"text doesn't much");
        System.out.println(bestsellervalidation.getText());
    }

    public void setBaby(){
        sleepFor(3);
        Baby.click();
    }

}
