package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {

//    WebDriver driver;
//
//    @BeforeMethod
//    public void setupMethod() {
//
//        // We are getting the browserType dynamically from our configuration.properties file
//        String browserType = ConfigurationReader.getProperty("browser");
//        driver = WebDriverFactory.getDriver(browserType);
//
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

    @Test
    public void google_search_box() throws InterruptedException {



        // 1. Go to: https://google.com
        Driver.getDriver().get("https://google.com");

        // accept the cookies
        WebElement agreeButton = Driver.getDriver().findElement(By.xpath("//button[@class='tHlp8d'][2]"));
        agreeButton.click();
        Thread.sleep(3000);

        // 3- Write “apple” in search box

        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        // 4- Verify title:
        // Expected: apple - Google Search

        String expectedTitle = ConfigurationReader.getProperty("searchValue") + " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }


}
