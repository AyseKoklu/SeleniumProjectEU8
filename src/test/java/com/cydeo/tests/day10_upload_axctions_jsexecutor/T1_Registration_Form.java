package com.cydeo.tests.day10_upload_axctions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_Form {


    @Test
    public void registration_form_test() {
        // TC#1: Registration form confirmation
        // Note: Use JavaFaker OR read from configuration.properties file when possible.
        // 1. Open browser
        // 2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        // create a JavaFaker object
        Faker faker = new Faker();

        // 3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        String fakerFirstName = faker.name().firstName();
        inputFirstName.sendKeys(fakerFirstName);

        // 4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        String fakerLastName = faker.name().lastName();
        inputLastName.sendKeys(fakerLastName);

        // 5. Enter username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        String fakerUsername = fakerFirstName.toLowerCase() + fakerLastName.toLowerCase() + faker.numerify("##");
        // String fakerUsername = (faker.name().username().replaceAll(".", "");
        inputUsername.sendKeys(fakerUsername);

        // 6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(fakerLastName.toLowerCase() + fakerFirstName.toLowerCase() + "@gmail.com");

        // 7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        // inputPassword.sendKeys(faker.numerify("########"));
        inputPassword.sendKeys(faker.internet().password());

        // 8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys(faker.numerify("###-###-####)"));

        // 9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        // 10.Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputBirthday.sendKeys("09/10/1997");

        // 11.Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1, 9));

        // 12.Select Job Title
        Select jobTitleDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitleDropdown.selectByIndex(faker.number().numberBetween(1,8));

        // 13.Select programming language from checkboxes
        WebElement programmingLanguage = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        programmingLanguage.click();

        // 14.Click to sign up button
        WebElement submitButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();

        // 15.Verify success message “You’ve successfully completed registration!” is displayed.
        WebElement wellDoneText = Driver.getDriver().findElement(By.xpath("//p"));
        String expectedWellDoneText = "You’ve successfully completed registration!";
        // String actualWellDoneText = wellDoneText;

        Assert.assertTrue(wellDoneText.isDisplayed());

    }
}
