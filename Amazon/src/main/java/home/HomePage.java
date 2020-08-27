package home;

import base.CommonAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class HomePage extends CommonAPI {



    @FindBy(how = How.CLASS_NAME, using = logoSingnCN)
    public WebElement logoSign;

    public void setLogoSign(){
        String actualText = "https://www.amazon.com/ref=nav_logo";
        String expectedText = "https://www.amazon.com/ref=nav_logo";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
    }




}
