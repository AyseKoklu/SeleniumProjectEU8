package com.cydeo.tasks.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
    public static void main(String[] args) throws InterruptedException {

        // TC #1: Etsy Title Verification
        // 1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://www.etsy.com

        driver.get("https://www.etsy.com");

        WebElement agreeButton = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        agreeButton.click();
        Thread.sleep(3000);

        // 3. Search for “wooden spoon”

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBox.sendKeys("wooden spoon", Keys.ENTER);

        // 4. Verify title:

        String expectedTitle = "Wooden spoon | Etsy UK";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Titles match");
        } else {
            System.out.println("Titles don't match");
        }

        //Expected: “Wooden spoon | Etsy”

    }
}
