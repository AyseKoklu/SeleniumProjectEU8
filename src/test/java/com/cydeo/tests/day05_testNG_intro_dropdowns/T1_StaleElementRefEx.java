package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {
    public static void main(String[] args) throws InterruptedException {

        // TC #1: StaleElementReferenceException handling
        // 1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/add_remove_elements/

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        // 3. Click to “Add Element” button

        WebElement addElement = driver.findElement(By.xpath("//button[.='Add Element']"));
        // or >>>>> //button[@onclick='addElement()']
        Thread.sleep(2000);
        addElement.click();



        // 4. Verify “Delete” button is displayed after clicking.
        // 5. Click to “Delete” button.
        // 6. Verify “Delete” button is NOT displayed after clicking.
        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

    }

}