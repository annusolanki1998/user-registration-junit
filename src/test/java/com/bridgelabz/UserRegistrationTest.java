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
        boolean actualOutput = userRegistration.validateFirstName.validate("Annu");
        Assert.assertTrue(actualOutput);
    }

    @Test(expected = UserRegistrationException.class)
    public void validateFirstNameForNegativeScenarioTest() {
        userRegistration.validateFirstName.validate("annu");
    }

    @Test
    public void validateLastNameForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validateLastName.validate("Kumari");
        Assert.assertTrue(actualOutput);
    }

    @Test(expected = UserRegistrationException.class)
    public void validateLastNameForNegativeScenarioTest() {
        userRegistration.validateLastName.validate("kumari");
    }

    @Test
    public void validateEmailIdForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validateEmailId.validate("annusinghraj1998@gmail.com");
        Assert.assertTrue(actualOutput);
    }

    @Test(expected = UserRegistrationException.class)
    public void validateEmailIdForNegativeScenarioTest() {
        userRegistration.validateEmailId.validate("annu.com");
    }


    @Test
    public void validateMobileNumberForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validateMobileNumber.validate("+91 7003265406");
        Assert.assertTrue(actualOutput);
    }

    @Test(expected = UserRegistrationException.class)
    public void validateMobileNumberForNegativeScenarioTest() {
        userRegistration.validateLastName.validate("+91 700326540678");
    }

    @Test
    public void validatePasswordForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validatePassword.validate("Annu@4998");
        Assert.assertTrue(actualOutput);
    }

    @Test(expected = UserRegistrationException.class)
    public void validatePasswordForNegativeScenarioTest() {
        userRegistration.validatePassword.validate("Annu4998");

    }
}
