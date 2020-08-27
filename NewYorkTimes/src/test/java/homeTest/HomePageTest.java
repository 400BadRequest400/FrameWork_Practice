package homeTest;

import base.CommonAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

    HomePage home;

    @BeforeMethod
    public void init(){
        home = PageFactory.initElements(driver,HomePage.class);
    }

    @Test(priority = 19)
    public void setWebLogoTest(){
        home.setWebLogo();
    }
    @Test(priority = 20)
    public void setWorlButtonTest(){
        home.setWorlButton();
    }
    @Test(priority = 21)
    public void setWorlButtonVerificationTest(){
        setWorlButtonTest();
        home.setWorlButtonVerification();
    }
    @Test(priority = 22)
    public void setUsButtonTest(){
        home.setUsButton();
    }
    @Test(priority = 23)
    public void setUsButtonVerificationTest(){
        setUsButtonTest();
        home.setUsButtonVerification();
    }
    @Test(priority = 24)
    public void setPoliticsButtonTest(){
        home.setPoliticsButton();
    }
    @Test(priority = 25)
    public void setPoliticsButtonVerificationTest(){
        setPoliticsButtonTest();
        home.setPoliticsButtonVerification();
    }
    @Test(priority = 26)
    public void setNyButtonTest(){
        home.setNyButton();
    }
    @Test(priority = 27)
    public void setNyButtonVerificationTest(){
        setNyButtonTest();
        home.setNyButtonVerification();
    }
    @Test(priority = 28)
    public void setBusinessButtonTest(){
        home.setBusinessButton();
    }
    @Test(priority = 29)
    public void setBusinessButtonVerificationTest(){
        setBusinessButtonTest();
        home.setBusinessButtonVerification();
    }
    @Test(priority = 30)
    public void setOpinionButtonTest(){
        home.setOpinionButton();
    }
    @Test(priority = 31)
    public void setOptionButtonVerificationTest(){
        setOpinionButtonTest();
        home.setOptionButtonVerification();
    }
    @Test(priority = 32)
    public void setTechButtonTest(){
        home.setTechButtonXP();
    }
    @Test(priority = 33)
    public void TechnologyTest(){
        setTechButtonTest();
        home.setTechButtonVerificationXP();
    }
    @Test(priority = 34)
    public void setScienceButtonTest(){
        home.setScienceButton();
    }
    @Test(priority = 35 )
    public void setScienceButtonVerificationTest(){
        setScienceButtonTest();
        home.setScienceButtonVerification();
    }
    @Test(priority = 36)
    public void setHealthTest(){
        home.setHealthButton();
    }
    @Test(priority = 37)
    public void setHealthVerificationTest(){
        setHealthTest();
        home.setHealthButtonVerification();
    }
    @Test(priority = 38)
    public void setSportsButtonTest(){
        home.setSportsButton();
    }
    @Test(priority = 39)
    public void setSportsButtonVerificationTest(){
        setSportsButtonTest();
        home.setSportsButtonVerification();
    }

}
