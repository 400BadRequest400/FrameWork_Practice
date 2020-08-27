package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static regression.RegressionElements.*;

public class HamburgerClass extends CommonAPI {

    @FindBy(how = How.XPATH, using = HamburgerButtonXP)
    public WebElement hamburgerButton;

    @FindBy(how = How.XPATH, using = HamburgerWorldButtonXP)
    public WebElement hamburgerWorldButton;

    public void setHamburgerButton(){
        hamburgerButton.click();
        sleepFor(2);
    }
    public void setHamburgerWorldButton(){
        setHamburgerButton();

        Actions actions = new Actions(driver);
        actions.moveToElement(hamburgerWorldButton).click();
        sleepFor(2);

    }
}
