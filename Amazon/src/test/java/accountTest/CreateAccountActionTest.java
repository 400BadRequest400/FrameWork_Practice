package accountTest;

import account.CreateAccountAction;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountActionTest extends CommonAPI {


    CreateAccountAction accountAction;

    @BeforeMethod
    public void init(){
        accountAction = PageFactory.initElements(driver,CreateAccountAction.class);
    }

    @Test(priority = 1)
    public void setSigninactionTest(){
        accountAction.setSigninaction();
    }
    @Test(priority = 2)
    public void setSigninactionTest2(){
        setSigninactionTest();
        accountAction.setField("jeff@selenium.com");
        accountAction.setContinuebutton();
        accountAction.setValidationText();

    }
}
