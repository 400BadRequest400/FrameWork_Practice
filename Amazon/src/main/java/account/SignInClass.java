package account;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static account.SignInElements.*;

public class SignInClass extends CommonAPI {

    @FindBy(how = How.XPATH, using = SigninButtonXP)
    public WebElement signin;

    @FindBy(how = How.XPATH, using = UserFieldXP)
    public WebElement field;

    @FindBy(how = How.XPATH, using = ContinueButtonXP)
    public WebElement continuebutton;

    @FindBy(how = How.CLASS_NAME, using = ContinueButtonValdation)
    public WebElement validationText;

    public void setSignin(){
        signin.click();
        sleepFor(3);
    }
    public void setField(String email){
        field.sendKeys(email);
        sleepFor(3);
    }
    public void setContinuebutton(){
        continuebutton.click();
        sleepFor(3);
    }
    public void setValidationText(){
        String actualresult = "There was a problem";
        String expectedResult = validationText.getText();
        Assert.assertEquals(actualresult,expectedResult,"Text doesn't match");
    }

}
