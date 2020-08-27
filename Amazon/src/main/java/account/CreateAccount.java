package account;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static account.SignInElements.*;

public class CreateAccount extends CommonAPI {

    @FindBy(how = How.XPATH, using = SigninButtonXP)
    public WebElement signin;

    @FindBy(how = How.ID, using = CreateAccountButtonID)
    public WebElement accountbutton;

    @FindBy(how = How.XPATH, using = CustomerNameXP)
    public WebElement customername;

    @FindBy(how = How.XPATH, using = CustomerEmailXP)
    public WebElement customeremail;

    @FindBy(how = How.XPATH, using = CustomerPassword1XP)
    public WebElement password1;

    @FindBy(how = How.XPATH, using = CustomerPassword2XP)
    public WebElement password2;

    @FindBy(how = How.XPATH, using = AmazonAccountXP)
    public WebElement account;

    @FindBy(how = How.XPATH, using = EmailverificationXP)
    public WebElement verificationemail;

    public void setSignin(){
        signin.click();
        sleepFor(1);
    }
    public void setAccountbutton(){
        accountbutton.click();
        sleepFor(1);
    }
    public void setCustomername(String name ){
        customername.sendKeys(name);
        sleepFor(1);
    }
    public void setCustomeremail(String email){
        customeremail.sendKeys(email);
        sleepFor(1);
    }
    public void setPassword1(String pass1){
        password1.sendKeys(pass1);
        sleepFor(1);
    }
    public void setPassword2(String pass2){
        password2.sendKeys(pass2);
        sleepFor(1);
    }
    public void setAccount(){
        account.click();
        sleepFor(1);
    }
    public void setVerificationemail(){
        String ActualText = verificationemail.getText();
        String ExpectedText = " Conditions of Use ";
        Assert.assertEquals(ActualText,ExpectedText,"Test Failed");

        sleepFor(1);
    }
}
