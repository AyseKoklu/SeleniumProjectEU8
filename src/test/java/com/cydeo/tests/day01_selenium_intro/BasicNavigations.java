package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the Selenium WebDriver
        // this is the line that opens the empty browser
        WebDriver driver = new ChromeDriver();

        // this line will maximise the browser size
        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        // 3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        // get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("Current Title = " + currentTitle);

        // Get the current URL using Selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL = " + currentURL);

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use Selenium to navigate back
        driver.navigate().back();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use Selenium to navigate forward
        driver.navigate().forward();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use Selenium to navigate refresh
        driver.navigate().refresh();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use navigate().to:
        driver.navigate().to("https://www.google.com");

        // get the title of the page
        // System.out.println(driver.getTitle());
        // or
        // System.out.println("driver.getTitle() = " + driver.getTitle());
        // or
        currentTitle = driver.getTitle();
        System.out.println("Current Title = " + currentTitle);

        // Get the current URL using Selenium
        currentURL = driver.getCurrentUrl();
        System.out.println("Current URL = " + currentURL);

        // this will close the currently opened window
        driver.close();

        // this will close all the opened windows / kills the session
        driver.quit(); // after this we will get NoSuchSessionException



    }

}
