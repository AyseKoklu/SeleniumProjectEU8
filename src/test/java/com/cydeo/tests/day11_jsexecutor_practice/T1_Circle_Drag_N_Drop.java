package com.cydeo.tests.day11_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {

    @Test
    public void test1_drag_and_drop(){
        // TC #: Drag and drop
        // 1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        // Locate "Accept Cookies" button and click
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();

        // 2. Drag and drop the small circle to bigger circle.


        // 3. Assert:
        // -Text in big circle changed to: “You did great!”
    }

}
