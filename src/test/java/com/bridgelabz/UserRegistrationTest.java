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

    @Test
    public void validateMultipleEmailIdForPositiveScenarioTest() {
        boolean actualOutput = userRegistration.validateMultipleEmailId("abc@yahoo.com");
        Assert.assertTrue(actualOutput);
        boolean actualOutput1 = userRegistration.validateMultipleEmailId("abc-100@yahoo.com");
        Assert.assertTrue(actualOutput1);
        boolean actualOutput2 = userRegistration.validateMultipleEmailId("abc.100@yahoo.com");
        Assert.assertTrue(actualOutput2);
        boolean actualOutput3 = userRegistration.validateMultipleEmailId("abc111@abc.com");
        Assert.assertTrue(actualOutput3);
        boolean actualOutput4 = userRegistration.validateMultipleEmailId("abc-100@abc.net");
        Assert.assertTrue(actualOutput4);
        boolean actualOutput5 = userRegistration.validateMultipleEmailId("abc@1.com");
        Assert.assertTrue(actualOutput5);
        boolean actualOutput6 = userRegistration.validateMultipleEmailId("abc+100@gmail.com");
        Assert.assertTrue(actualOutput6);
    }

    @Test
    public void validateMultipleEmailIdForNegativeScenarioTest() {
        boolean actualOutput = userRegistration.validateMultipleEmailId("abc");
        Assert.assertFalse(actualOutput);
        boolean actualOutput1 = userRegistration.validateMultipleEmailId("abc@.com.my");
        Assert.assertFalse(actualOutput1);
        boolean actualOutput2 = userRegistration.validateMultipleEmailId("abc123@gmail.a");
        Assert.assertFalse(actualOutput2);
        boolean actualOutput3 = userRegistration.validateMultipleEmailId("abc123@.com");
        Assert.assertFalse(actualOutput3);
        boolean actualOutput4 = userRegistration.validateMultipleEmailId("abc123@.com.com");
        Assert.assertFalse(actualOutput4);
        boolean actualOutput5 = userRegistration.validateMultipleEmailId(".abc@*abc.com");
        Assert.assertFalse(actualOutput5);
        boolean actualOutput6 = userRegistration.validateMultipleEmailId("abc@%*.com");
        Assert.assertFalse(actualOutput6);
        boolean actualOutput7 = userRegistration.validateMultipleEmailId("abc()*@gmail.com.a");
        Assert.assertFalse(actualOutput7);
        boolean actualOutput8 = userRegistration.validateMultipleEmailId("abc@%*.com");
        Assert.assertFalse(actualOutput8);
        boolean actualOutput9 = userRegistration.validateMultipleEmailId("abc..2002@gmail.com-");
        Assert.assertFalse(actualOutput9);
        boolean actualOutput10 = userRegistration.validateMultipleEmailId("abc.@gmail.com-");
        Assert.assertFalse(actualOutput10);
        boolean actualOutput11 = userRegistration.validateMultipleEmailId("abc@abc@gmail.com");
        Assert.assertFalse(actualOutput11);
        boolean actualOutput12 = userRegistration.validateMultipleEmailId("abc@gmail.com.1a");
        Assert.assertFalse(actualOutput12);
        boolean actualOutput13 = userRegistration.validateMultipleEmailId("abc@gmail.com.aa.au");
        Assert.assertFalse(actualOutput13);
    }

}
