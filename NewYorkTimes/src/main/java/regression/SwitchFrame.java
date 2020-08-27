package regression;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SwitchFrame extends CommonAPI {

    @Test
    public void setframe() {

         //navigates to the Browser
        driver.get("http://demo.guru99.com/test/guru99home/");
        // navigates to the page consisting an iframe

        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e");
        sleepFor(3);

        //switching the frame by ID
        System.out.println(driver.findElements(By.tagName("iframe")).size());

        System.out.println("********We are switch to the iframe*******");
        driver.findElement(By.xpath("html/body/a/img")).click();
        sleepFor(3);
        //Clicks the iframe

        System.out.println("*********We are done***************");
    }
}
