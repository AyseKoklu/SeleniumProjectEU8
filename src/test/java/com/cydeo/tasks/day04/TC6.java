package com.cydeo.tasks.day04;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC6 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        // TC #6: XPATH LOCATOR practice
        // 1. Open Chrome browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void button1(){

        // 2. Go to http://practice.cydeo.com/multiple_buttons

        driver.get("http://practice.cydeo.com/multiple_buttons");

        // 3. Click on Button 1

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        // 4. Verify text displayed is as expected:
        // Expected: “Clicked on button one!”

        WebElement textResult = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedButton1Text = "Clicked on button one!";
        String actualButton1Text = textResult.getText();

        Assert.assertEquals(actualButton1Text,expectedButton1Text);


        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

    }
    }

