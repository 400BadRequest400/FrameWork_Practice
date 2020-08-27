package account;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static account.SignInElements.*;

public class CreateAccountAction extends CommonAPI {


    @FindBy(how = How.XPATH, using = SigninButtonXP)
    public WebElement signin;

    @FindBy(how = How.XPATH, using = SigninActionXP)
    public WebElement signinaction;

    @FindBy(how = How.XPATH, using = UserFieldXP)
    public WebElement field;

    @FindBy(how = How.XPATH, using = ContinueButtonXP)
    public WebElement continuebutton;

    @FindBy(how = How.CLASS_NAME, using = ContinueButtonValdation)
    public WebElement validationText;


    public void setSigninaction(){

        Actions actions = new Actions(driver);
        actions.moveToElement(signin).build().perform();
        sleepFor(1);
        signinaction.click();
        sleepFor(1);

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
