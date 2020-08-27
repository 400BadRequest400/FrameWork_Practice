package homeTest;

import base.CommonAPI;
import home.BestSellerPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BestSellerPageTest extends CommonAPI {

    BestSellerPage bestSellerPage;

    @BeforeMethod
    public void init(){
        bestSellerPage = PageFactory.initElements(driver,BestSellerPage.class);
    }


    @Test(priority = 14)
    public void setBestSellerPageTest(){
        bestSellerPage.setBestsellerbutton();
    }

    @Test(priority = 15)
    public void setbestsellervalidationTest(){
        bestSellerPage.setBestsellervalidation();
    }

    @Test(priority = 16)
    public void setBabyTest(){
        bestSellerPage.setBaby();
    }


}
