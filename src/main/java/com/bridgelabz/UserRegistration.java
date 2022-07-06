package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface IUserRegistrationFunction {
    boolean validate(String input) throws UserRegistrationException;
}
public class UserRegistration {
    private static final String NAME_REGEX = "[A-Z][a-z]{2,}";
    IUserRegistrationFunction validateFirstName = firstName -> {
        if (Pattern.matches(NAME_REGEX, firstName)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid first name");
        }
    };

    IUserRegistrationFunction validateLastName = lastName -> {
        if (Pattern.matches(NAME_REGEX, lastName)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid last name");
        }
    };

    IUserRegistrationFunction validateEmailId = emailId -> {
        if (Pattern.matches("[a-z][A-Z a-z 0-9]+[@][a-z]+[.][a-z]{2,}", emailId)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid Email");
        }
    };

    IUserRegistrationFunction validateMobileNumber = mobileNumber -> {
        if (Pattern.matches("[+]91 [6-9]\\d{9}", mobileNumber)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid mobile number");
        }
    };

    IUserRegistrationFunction validatePassword = password -> {
        if (Pattern.matches("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}", password)) {
            return true;
        } else {
            throw new UserRegistrationException("Invalid Password");
        }
    };

}