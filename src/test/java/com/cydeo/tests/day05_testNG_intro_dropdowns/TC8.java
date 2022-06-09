package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC8 {

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
    public void test_case_8(){
        // TC #8: Selecting value from multiple select dropdown
        // 3. Select all the options from multiple select dropdown.
        Select multipleSelect = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        for (int i = 0; i < 6; i++) {
            multipleSelect.selectByIndex(i);
        }

        // 4. Print out all selected values.
        List<WebElement> allLanguages = driver.findElements(By.xpath("//select[@name='Languages']//option"));
        for (WebElement language : allLanguages) {
            System.out.println(language.getText());
        }

        // 5. Deselect all values.
        multipleSelect.deselectAll();
    }
}
