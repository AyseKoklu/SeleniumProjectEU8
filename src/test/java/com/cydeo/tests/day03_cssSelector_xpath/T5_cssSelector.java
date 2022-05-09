package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_cssSelector {
    public static void main(String[] args) {

        // TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");

        // 3- Enter incorrect username into login box:

        WebElement usernameInput = driver.findElement(By.cssSelector("input[class='login-inp']"));
        usernameInput.sendKeys("incorrect");

        // 4- Click to `Reset password` button

        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[onclick='BX.addClass(this, \\'wait\\');']"));
        resetPasswordButton.click();


        // 5- Verify “error” label is as expected
        // Expected: Login or E-mail not found

        WebElement errorMessage = driver.findElement(By.cssSelector("div[class='errortext']"));

        String expectedErrorLabel = "Login or E-mail not found";
        String actualErrorLabel = errorMessage.getText();

        if (actualErrorLabel.equals(expectedErrorLabel)){
            System.out.println("Error message verification PASSED!");
        } else {
            System.out.println("Error message verification FAILED!");
        }

        // PS: Inspect and decide which locator you should be using to locate web elements.
        // PS2: Pay attention to where to get the text of this button from

    }
}
