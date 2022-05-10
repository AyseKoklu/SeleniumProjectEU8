package com.cydeo.tests.day04_findElements_checkboxes_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        // TC #1: XPATH and cssSelector Practices
        // 1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com/forgot_password

        driver.get("https://practice.cydeo.com/forgot_password");

        // 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)

        // a. “Home” link

        // Locate homeLink using cssSelector
        WebElement homeLink1= driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink2= driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink3= driver.findElement(By.cssSelector("a[href='/']"));

        // b. “Forgot password” header

        // Locate header using cssSelector: locate parent element and move down to h2
        WebElement header1 = driver.findElement(By.cssSelector("div.example > h2"));

        // Locate header using xpath
        WebElement header2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement header3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        // c. “E-mail” text

        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        // d. E-mail input box

        WebElement inputBox1 = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement inputBox2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        // e. “Retrieve password” button

        //button[@type='submit']
        //button[@class='radius']
        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));

        // f. “Powered by Cydeo text

        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        // 4. Verify all web elements are displayed.

        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("header1.isDisplayed() = " + header1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox1.isDisplayed() = " + inputBox1.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

        // First solve the task with using cssSelector only. Try to create 2 different cssSelector if possible
        // Then solve the task using XPATH only. Try to create 2 different XPATH locator if possible

    }

}
