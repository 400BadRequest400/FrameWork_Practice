package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static regression.RegressionElements.LiveVideoValidationXP;
import static regression.RegressionElements.LiveVideoXP;

public class LiveClass extends CommonAPI {

    @FindBy(how = How.XPATH, using = LiveVideoXP)
    public WebElement liveVideo;

    @FindBy(how = How.XPATH, using = LiveVideoValidationXP)
    public WebElement liveVideoValidation;

    public void setLiveVideo(){
        liveVideo.click();
        sleepFor(2);
    }
    public void setLiveVideoValidation(){
        String actualResult = liveVideoValidation.getText();
        String expectedResult = "Watch Live: R.N.C. Night 3 Video and Analysis";
        Assert.assertEquals(actualResult,expectedResult,"Watch Live: R.N.C. Night 3 Video and Analysis");
    }
}
