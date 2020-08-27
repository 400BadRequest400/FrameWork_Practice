package regressionTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.LiveClass;

public class LiveClassTest extends CommonAPI {

    LiveClass object;

    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver,LiveClass.class);
    }
    @Test(priority = 43)
    public void setLiveVideoTest(){
        object.setLiveVideo();
    }
    @Test(priority = 44)
    public void setLiveVideoValidation(){
        setLiveVideoTest();
        object.setLiveVideoValidation();
    }
}
