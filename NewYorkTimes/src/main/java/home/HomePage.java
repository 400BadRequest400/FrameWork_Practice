package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static home.HomePageElements.*;

public class HomePage extends CommonAPI {

    @FindBy(how = How.XPATH, using = WebLogoXP)
    public WebElement webLogo;

    @FindBy(how = How.XPATH,using = WorldButtonXP)
    public WebElement worlButton;

    @FindBy(how = How.XPATH,using = WorldButtonVerificationXP)
    public WebElement worlButtonVerification;

    @FindBy(how = How.XPATH,using = UsButtonXP)
    public WebElement usButton;

    @FindBy(how = How.XPATH,using = UsButtonVerificationXP)
    public WebElement usButtonVerification;

    @FindBy(how = How.XPATH,using = PoliticsButtonXP)
    public WebElement politicsButton;

    @FindBy(how = How.XPATH,using = PoliticsButtonVerificationXP)
    public WebElement politicsButtonVerification;

    @FindBy(how = How.XPATH, using = NYButtonXP)
    public WebElement nyButton;

    @FindBy(how = How.XPATH, using = NYButtonVerificationXP)
    public WebElement nyButtonVerification;

    @FindBy(how = How.XPATH, using = BusinessButtonXP)
    public WebElement businessButton;

    @FindBy(how = How.XPATH, using = BusinessButtonVerificationXP)
    public WebElement businessButtonVerification;

    @FindBy(how = How.XPATH, using = OpinionButtonXP)
    public WebElement opinionButton;

    @FindBy(how = How.XPATH, using = OpinionButtonVerificationXP)
    public WebElement opinionButtonVerification;

    @FindBy(how = How.XPATH, using = TechButtonXP)
    public WebElement techButtonXP;

    @FindBy(how = How.XPATH, using = TechButtonVerificationXP)
    public WebElement techButtonVerificationXP;

    @FindBy(how = How.XPATH, using = ScienceButtonXP)
    public WebElement scienceButton;

    @FindBy(how = How.XPATH, using = ScienceButtonVerificationXP)
    public WebElement scienceButtonVerification;

    @FindBy(how = How.XPATH, using = HealthButtonXP )
    public WebElement healthButton;

    @FindBy(how = How.XPATH, using = HealthButtonVerificationXP )
    public WebElement healthButtonVerification;

    @FindBy(how = How.XPATH, using = SportsButtonXP)
    public WebElement sportsButton;

    @FindBy(how = How.XPATH, using = SportsButtonVerificationXP)
    public WebElement sportsButtonVerification;


    public void setWebLogo(){
        String actualText = webLogo.getTagName();
        String expectedText = "svg";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(2);
    }
    public void setWorlButton(){
        worlButton.click();
        sleepFor(2);
    }
    public void setWorlButtonVerification(){
        String actualText = worlButtonVerification.getText();
        String expectedText = "World News";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(2);
    }
    public void setUsButton(){
        usButton.click();
    }
    public void setUsButtonVerification(){
        String actualText = usButtonVerification.getText();
        String expectedText = "U.S. News";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(2);
    }
    public void setPoliticsButton(){
        politicsButton.click();
    }
    public void setPoliticsButtonVerification(){
        String actualText = politicsButtonVerification.getText();
        String expectedText = "Politics";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(2);
    }
    public void setNyButton(){
        nyButton.click();
    }
    public void setNyButtonVerification(){
        String actualText = nyButtonVerification.getText();
        String expectedText = "New York";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(2);
    }
    public void setBusinessButton(){
        businessButton.click();
        sleepFor(2);
    }
    public void setBusinessButtonVerification(){
        String actualText = businessButtonVerification.getText();
        String expectedText = "Business";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(2);
    }
    public void setOpinionButton(){
        opinionButton.click();
        sleepFor(2);
    }
    public void setOptionButtonVerification(){
        String actualText = opinionButtonVerification.getText();
        String expectedText = "Opinion";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(2);
    }
    public void setTechButtonXP(){
        techButtonXP.click();
        sleepFor(2);
    }
    public void setTechButtonVerificationXP(){
        String actualText = techButtonVerificationXP.getText();
        String expectedText = "Technology";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(2);
    }
    public void setScienceButton(){
        scienceButton.click();
        sleepFor(2);
    }
    public void setScienceButtonVerification(){
        String actualText = scienceButtonVerification.getText();
        String expectedText = "Science";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(2);
    }
    public void setHealthButton(){
        healthButton.click();
        sleepFor(2);
    }
    public void setHealthButtonVerification(){
        String actualText = healthButtonVerification.getText();
        String expectedText = "Health";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(2);
    }
    public void setSportsButton(){
        sportsButton.click();
        sleepFor(2);
    }
    public void setSportsButtonVerification(){
        String actualText = sportsButtonVerification.getText();
        String expectedText = "Sports";
        Assert.assertEquals(actualText,expectedText,"text doesn't match");
        sleepFor(2);
    }
}
