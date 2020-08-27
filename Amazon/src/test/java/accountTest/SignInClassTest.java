package accountTest;

import account.SignInClass;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInClassTest extends CommonAPI {

    SignInClass object;

    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver,SignInClass.class);
    }

    @Test(priority = 10)
    public void setsigninTest(){
        object.setSignin();
    }
    @Test(priority = 11)
    public void setFieldTest(){
        object.setSignin();
        object.setField("jeff@selenium.com");
    }
    @Test(priority = 12)
    public void setContinuebutton(){
        object.setSignin();
        object.setField("jeff@selenium.com");
        object.setContinuebutton();
    }
    @Test(priority = 13)
    public void setValidationTextTest(){
        object.setSignin();
        object.setField("jeff@selenium.com");
        object.setContinuebutton();
        object.setValidationText();
    }
}
