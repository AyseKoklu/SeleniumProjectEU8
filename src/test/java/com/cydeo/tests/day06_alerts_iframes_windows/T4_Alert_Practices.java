package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Alert_Practices {

    WebDriver driver;

    // @BeforeMethod
    @BeforeClass
    public void setupMethod() {

        //1. Open browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to: https://practice.cydeo.com/iframe

        driver.get("https://practice.cydeo.com/iframe");
    }

    // @Ignore ---->>>> when you put this annotation it ignores the text
    @Test
    public void iframe_test(){
        // TC #4: Iframe practice

        // we need to switch driver's focus to iframe
        // option number #1- switching to iframe using id attribute value
        // driver.switchTo().frame("mce_0_ifr");
        // option number #2- passing index no of iframe
        // driver.switchTo().frame(0);
        // option number #3- locate as web element and pass in frame() method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@allowtransparency='true']")));


        // locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        // 4. Assert: “Your content goes here.” Text is displayed.

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        // 5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”

        // to be able to verify the header, we must switch back to "main html"
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        // assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());



    }


}
