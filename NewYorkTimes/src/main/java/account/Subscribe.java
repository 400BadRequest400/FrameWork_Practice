package account;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static account.AccountElements.*;

public class Subscribe extends CommonAPI {

    @FindBy(how = How.XPATH, using = SubscribeButtonXP)
    public WebElement subscribeButton;

    @FindBy(how = How.XPATH, using = SubscribeSubmitXP)
    public WebElement subScribeSubmit;

    @FindBy(how = How.XPATH, using = EmailFieldXP)
    public WebElement emailField;

    public void setSubscribeButton(String email){
        subscribeButton.click();
        sleepFor(2);

        String url = driver.getCurrentUrl();
        System.out.println(url);
        if (url.equals("https://www.nytimes.com/subscription?campaignId=79FKF&redirect_uri=https%3A%2F%2Fwww.nytimes.com%2F")) {
            System.out.println("Url got matched");
        } else {
            System.out.println("Url did not matched");
        }
        subScribeSubmit.click();


        System.out.println(driver.findElements(By.tagName("iframe")).size());

        //driver.switchTo().frame(18).findElement(By.xpath("//input[@id='email']")).sendKeys(email);


//        sleepFor(2);
//        emailField.sendKeys(email);
    }



}
