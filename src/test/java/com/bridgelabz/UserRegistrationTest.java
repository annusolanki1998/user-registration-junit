package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration;

    @Before
    public void setup() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void validateFirstNameForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validateFirstName("Annu");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateFirstNameForNegativeScenarioTest() {
        boolean actualOutput = userRegistration.validateFirstName("annu");
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validateLastNameForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validateLastName("Solanki");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateLastNameForNegativeScenarioTest() {
        boolean actualOutput = userRegistration.validateLastName("solanki");
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validateEmailIdForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validateEmailId("annusinghraj1998@gmail.com");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateEmailIdForNegativeScenarioTest() {
        boolean actualOutput = userRegistration.validateLastName("annu.com");
        Assert.assertFalse(actualOutput);
    }


    @Test
    public void validateMobileNumberForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validateMobileNumber("+91 7003265406");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validateMobileNumberForNegativeScenarioTest() {
        boolean actualOutput = userRegistration.validateLastName("+91 700326540678");
        Assert.assertFalse(actualOutput);
    }

    @Test
    public void validatePasswordForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validatePassword("Annu@4998");
        Assert.assertTrue(actualOutput);
    }

    @Test
    public void validatePasswordForNegativeScenarioTest() {
        boolean actualOutput = userRegistration.validatePassword("Annu4998");
        Assert.assertFalse(actualOutput);
    }

}
