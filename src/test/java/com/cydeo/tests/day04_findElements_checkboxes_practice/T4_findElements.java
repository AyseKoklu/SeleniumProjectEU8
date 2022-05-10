package com.cydeo.tests.day04_findElements_checkboxes_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {

    public static void main(String[] args) {

        // TC #4: FindElements Task
        // 1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2- Go to: https://practice.cydeo.com/abtest

        driver.get("https://practice.cydeo.com/abtest");

        // 3- Locate all the links in the page.

        // shortcut: option + enter >> enter again
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // 4- Print out the number of the links on the page.

        int size = allLinks.size();
        System.out.println("size = " + size);

        // 5- Print out the texts of the links.

        int i = 1;
        for (WebElement each : allLinks) {
            System.out.println("Text of " + i++ + ". link: " + each.getText());
        }

        // 6- Print out the HREF attribute values of the links




    }
}
