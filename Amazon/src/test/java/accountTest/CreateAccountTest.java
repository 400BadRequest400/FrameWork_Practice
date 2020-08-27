package accountTest;

import account.CreateAccount;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends CommonAPI {

    CreateAccount obj;

    @BeforeMethod
    public void init(){
        obj = PageFactory.initElements(driver,CreateAccount.class);
    }

    @Test(priority = 3)
    public void setAccountbuttontest(){
        obj.setSignin();
        obj.setAccountbutton();
    }
    @Test(priority = 4)
    public void setCustomernameTest(){
        obj.setSignin();
        obj.setAccountbutton();
        obj.setCustomername("jeff");
    }
    @Test(priority = 5)
    public void setCustomeremailTest(){
        obj.setSignin();
        obj.setAccountbutton();
        obj.setCustomername("jeff");
        obj.setCustomeremail("jeff@selenium.com");
    }
    @Test(priority = 6)
    public void setPassword1Test(){
        obj.setSignin();
        obj.setAccountbutton();
        obj.setCustomername("jeff");
        obj.setCustomeremail("jeff@selenium.com");
        obj.setPassword1("cirta");
    }
    @Test(priority = 7)
    public void setPassword2Test(){
        obj.setSignin();
        obj.setAccountbutton();
        obj.setCustomername("jeff");
        obj.setCustomeremail("jeff@selenium.com");
        obj.setPassword1("cirta2020");
        obj.setPassword2("cylia2020");
    }
    @Test(priority = 8)
    public void setAccounttestTest(){
        obj.setSignin();
        obj.setAccountbutton();
        obj.setCustomername("jeff");
        obj.setCustomeremail("jeff@selenium.com");
        obj.setPassword1("cirta2020");
        obj.setPassword2("cirta2020");
        obj.setAccount();
    }
    @Test(priority = 9)
    public void setVerificationemailTest(){
        setAccounttestTest();
        obj.setVerificationemail();
    }


}
