package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static home.AccountWebElement.*;

public class SearchBox extends CommonAPI {

    @FindBy(how = How.XPATH,using = searchBoxXP)
    public WebElement searchButton;

    public void setSearchButton(){
        searchButton.click();
        sleepFor(3);
    }
}