package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC7 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        // 1. Open Chrome browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/dropdown

        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void test_case_7(){
        // TC #7: Selecting value from non-select dropdown
        // 3. Click to non-select dropdown
        WebElement nonSelectDropdown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelectDropdown.click();

        // 4. Select Facebook from dropdown
        WebElement facebook = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
        facebook.click();

        // 5. Verify title is “Facebook - log in or sign up”
        String expectedTitle = "Facebook – log in or sign up";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

}
