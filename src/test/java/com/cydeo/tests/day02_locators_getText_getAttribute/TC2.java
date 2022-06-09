package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
    public static void main(String[] args) {

        // TC #2: Zero Bank header verification
        // 1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to http://zero.webappsecurity.com/login.html

        driver.get("http://zero.webappsecurity.com/login.html");

        // 3. Verify header text
        // Expected: “Log in to ZeroBank”

        String expectedHeaderText = "Log in to ZeroBank";
        WebElement headerText = driver.findElement(By.xpath("//h3"));
        String actualHeaderText = headerText.getText();

        if (expectedHeaderText.equals(actualHeaderText)){
            System.out.println("Titles match");
        } else {
            System.out.println("Titles don't match");
        }

    }
}
