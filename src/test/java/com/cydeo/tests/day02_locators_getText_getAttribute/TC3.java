package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {
    public static void main(String[] args) throws InterruptedException {

        // TC #3: Back and forth navigation
        // 1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://google.com

        driver.get("https://google.com");
        WebElement agreeButton = driver.findElement(By.xpath("//button[@class='tHlp8d'][2]"));
        agreeButton.click();
        Thread.sleep(3000);

        // 3- Click to Gmail from top right.

        WebElement gmailButton = driver.findElement(By.xpath("//a[@class='gb_d']"));
        gmailButton.click();

        // 4- Verify title contains:
        // Expected: Gmail

        String actualTitle = driver.getTitle();

        if (actualTitle.contains("Gmail")){
            System.out.println("Title contains Gmail");
        } else {
            System.out.println("Title don't contain Gmail");
        }

        // 5- Go back to Google by using the .back();

        driver.navigate().back();

        // 6- Verify title equals:
        // Expected: Google

        String expectedMainPageTitle = "Google";
        String actualMainPageTitle = driver.getTitle();

        if (expectedMainPageTitle.equals(actualMainPageTitle)){
            System.out.println("Titles match");
        } else {
            System.out.println("Titles don't match");
        }



    }
}
