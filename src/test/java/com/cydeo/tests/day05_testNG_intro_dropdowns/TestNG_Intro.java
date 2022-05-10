package com.cydeo.tests.day05_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @Test (priority = 1)
    public void test1(){
        System.out.println("Test1 is running...");

        // ASSERT EQUALS: Compare 2 of the same things

        String actual = "Apple";
        String expected = "Apple";

        Assert.assertEquals(actual, expected);

    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("Test2 is running...");

        // ASSERT TRUE
        String actual = "Apple";
        String expected = "Apple";

        Assert.assertTrue(actual.equals(expected));
    }

    @BeforeClass
    public void setUpClass(){
        System.out.println("----> BeforeClass is running!");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("----> AfterClass is running!");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("--> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--> AfterMethod is running!");
    }


}


