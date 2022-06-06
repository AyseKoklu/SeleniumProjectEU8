package com.cydeo.tests.day09_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){

        // Creating Faker object to reach methods
        Faker faker = new Faker();
        // Faker faker = new Faker(new Locale("tr"));

        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        // numerify() method will generate random numbers in the format we want to get
        System.out.println("faker.numerify(\"#####-###-###\") = " + faker.numerify("#####-###-###"));
        System.out.println("faker.numerify(\"07475-###-###\") = " + faker.numerify("07475-###-###"));

        // letherify() method will generate random letters in the format we want to get
        System.out.println("faker.letterify(\"ar?-????\") = " + faker.letterify("ar?-????"));

        //bothify() method will generate random alphanumerics in the format we want to get
        System.out.println("faker.bothify(\"??#x#x?\") = " + faker.bothify("??#x#x?"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-", " "));

        System.out.println("faker.chuckNorris().fact() = " +
                faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));
    }
}
