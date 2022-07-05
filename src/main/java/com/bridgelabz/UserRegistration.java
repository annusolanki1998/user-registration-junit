package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_REGEX = "[A-Z][a-z]{2,}";

    public boolean validateFirstName(String firstName) {
        if (Pattern.matches(NAME_REGEX, firstName)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid first name");
        }
    }

    public boolean validateLastName(String lastName) {
        if (Pattern.matches(NAME_REGEX, lastName)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid last name");
        }
    }

    public boolean validateEmailId(String emailId) {
        if (Pattern.matches("[a-z][A-Z a-z 0-9]+[@][a-z]+[.][a-z]{2,}", emailId)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid Email");
        }
    }

    public boolean validateMobileNumber(String mobileNumber) {
        if (Pattern.matches("[+]91 [6-9]\\d{9}", mobileNumber)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid mobile number");
        }
    }

    public boolean validatePassword(String password) {
        if (Pattern.matches("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}", password)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid Password");
        }
    }
}
