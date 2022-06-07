package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void order_name_verify_test(){
        // TC #1: Web table practice

        // locate the cell that has Bob Martin text in it
        WebElement bobName = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        // 2. Verify Bob’s name is listed as expected.
        // Expected: “Bob Martin”
        String expectedName = "Bob Martin";
        String actualName = bobName.getText();

        Assert.assertTrue(expectedName.equals(actualName));

        // 3. Verify Bob Martin’s order date is as expected.
        // Expected: 12/31/2021
        WebElement bobDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedDate = "12/31/2021";
        String actualDate = bobDate.getText();

        Assert.assertTrue(expectedDate.equals(actualDate));

    }

    @Test
    public void test2(){
        String customerOrderDate1 = WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);

        String customerOrderDate2 = WebTableUtils.returnOrderDate(driver,"John Doe");
        System.out.println("customerOrderDate2 = " + customerOrderDate2);
    }

    @Test
    public void test3(){
        WebTableUtils.orderVerify(driver, "John Doe", "01/08/2021");
    }
}
