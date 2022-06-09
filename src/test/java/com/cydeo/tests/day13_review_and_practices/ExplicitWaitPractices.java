package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractices {

    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setupMethod() {
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();
    }

    @Test
    public void remove_button_test() {
        // TC #2: Explicit wait practice
        // 3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();

        // 4- Wait until “loading bar disappears”
9//        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
//        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

        // 5- Verify:
        // a. Checkbox is not displayed
        try {
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Assert.assertTrue(!(dynamicControlsPage.checkBox.isDisplayed()));
            Assert.assertFalse(dynamicControlsPage.checkBox.isDisplayed());
        } catch (NoSuchElementException n) {
            Assert.assertTrue(true);
        }

        // b. “It’s gone!” message is displayed.
    }

    @Test
    public void enable_button_test() {
        // TC #3: Explicit wait practice
        // 3- Click to “Enable” button

        //4- Wait until “loading bar disappears”
        //5- Verify:
        //a. Input box is enabled.
        //b. “It’s enabled!” message is displayed.
    }

}