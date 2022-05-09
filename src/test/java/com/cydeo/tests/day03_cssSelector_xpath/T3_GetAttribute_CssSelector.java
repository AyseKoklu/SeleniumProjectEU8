package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class T3_GetAttribute_CssSelector {
    public static void main(String[] args) {

        // TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");

        // 3- Verify “Log in” button text is as expected:
        // Expected: Log In



        // PS: Inspect and decide which locator you should be using to locate web elements.
        // PS2: Pay attention to where to get the text of this button from

    }
}
