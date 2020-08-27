package homeTest;
import base.CommonAPI;
import home.Account;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountTest extends CommonAPI {

    Account object;

    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,Account.class);
    }
    @Test(enabled = false)
    public void setAccountButtonTest(){
        object.setAccountButton();
    }
    @Test(enabled = false)
    public void setLogInButtonTest(){
        setAccountButtonTest();
        object.setLogInButton();
    }
    @Test(priority = 45)
    public void setAdvancedButtonTest(){
        setAccountButtonTest();
        object.setAdvancedButton();
    }

}