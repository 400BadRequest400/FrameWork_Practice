package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static home.AccountWebElement.*;

public class Account extends CommonAPI {

    @FindBy(how = How.ID,using = MyAccountButtonID)
    public WebElement accountButton;

    @FindBy(how = How.XPATH,using = LogInButtonXP)
    public WebElement logInButton;

    @FindBy(how = How.XPATH, using = AdvancedButtonXP)
    public WebElement advancedButton;


    public void setAccountButton(){
        accountButton.click();
        sleepFor(3);
    }
    public void setLogInButton(){
        setAccountButton();
        logInButton.click();
        sleepFor(3);
    }
    public void setAdvancedButton(){
        setLogInButton();
        accountButton.click();
        sleepFor(3);
    }
}