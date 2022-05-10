package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        // TC #1: Yahoo Title Verification
        // do set up for browser driver
        WebDriverManager.chromedriver().setup();

        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        // 3. Verify title:
        // Expected: Yahoo is part of the Yahoo family of brands
        String expectedTitle = "Yahoo is part of the Yahoo family of brands";

        // actual title will come from the browser
        String currentTitle = driver.getTitle();

        System.out.println("Expected Title = " + expectedTitle);
        System.out.println("Current Title = " + currentTitle);

        if (expectedTitle.equals(currentTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        } else{
            System.out.println("Title is NOT as expected. Verification FAILED!");
        }


    }

}
