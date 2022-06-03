package com.cydeo.tasks.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4 {
    public static void main(String[] args) {

        // TC #4: Practice Cydeo – Class locator practice
        // 1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://practice.cydeo.com/inputs

        driver.get("https://practice.cydeo.com/inputs");

        // 3- Click to “Home” link

        WebElement homeButton = driver.findElement(By.xpath("//a[@class='nav-link']"));
        homeButton.click();

        // 4- Verify title is as expected:
        // Expected: Practice
        // PS: Locate “Home” link using “className” locator

        String expectedHomeTitle = "Practice";
        String actualHomeTitle = driver.getTitle();

        if (expectedHomeTitle.equals(actualHomeTitle)){
            System.out.println("Titles match");
        } else {
            System.out.println("Titles don't match");
        }


    }
}
