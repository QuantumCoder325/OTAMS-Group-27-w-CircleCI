package com.example.otams_project;

import org.junit.Test;

public class InputValidatorUnitTest {

    @Test
    public void nameCorrectlyValidated() {
        assert InputValidator.validateName(null) != 1: "Should be invalid";
        assert InputValidator.validateName("") != 1: "Should be invalid";
        assert InputValidator.validateName("lowercasetest") != 1: "Should be invalid";
        assert InputValidator.validateName("lOwERcaSeTESTtwO") != 1: "Should be invalid";
        assert InputValidator.validateName("lOwERcaSeTESTthr33") != 1: "Should be invalid";
        assert InputValidator.validateName("Sp3ci@l") != 1: "Should be invalid";

        assert InputValidator.validateName("Tim-Thomson") == 1: "Should be valid";
        assert InputValidator.validateName("Bobby") == 1: "Should be valid";
        assert InputValidator.validateName("Billy Bob") == 1: "Should be valid";
    }

    @Test
    public void passwordCorrectlyValidated() {
        assert InputValidator.validatePassword(null) != 1: "Should be invalid";
        assert InputValidator.validatePassword("") != 1: "Should be invalid";
        assert InputValidator.validatePassword("1234567") != 1: "Should be invalid";
        assert InputValidator.validatePassword("123456@") != 1: "Should be invalid";
        assert InputValidator.validatePassword("12345678") != 1: "Should be invalid";

        assert InputValidator.validatePassword("1234567@") == 1: "Should return be valid";
    }

    @Test
    public void phoneNumberCorrectlyValidated() {
        assert InputValidator.validatePhoneNumber(null) != 1: "Should be invalid";
        assert InputValidator.validatePhoneNumber("") != 1: "Should be invalid";
        assert InputValidator.validatePhoneNumber("12345") != 1: "Should be invalid";
        assert InputValidator.validatePhoneNumber("123456789@") != 1: "Should be invalid";
        assert InputValidator.validatePhoneNumber("123456789A") != 1: "Should be invalid";

        assert InputValidator.validatePhoneNumber("1234567890") == 1: "Should return be valid";
    }

    @Test
    public void emailAddressCorrectlyValidated() {
        assert InputValidator.validateEmailAddress(null) != 1: "Should be invalid";
        assert InputValidator.validateEmailAddress("") != 1: "Should be invalid";
        assert InputValidator.validateEmailAddress("@") != 1: "Should be invalid";
        assert InputValidator.validateEmailAddress(".") != 1: "Should be invalid";
        assert InputValidator.validateEmailAddress("@.") != 1: "Should be invalid";
        assert InputValidator.validateEmailAddress("tester@.") != 1: "Should be invalid";
        assert InputValidator.validateEmailAddress("tester@test.") != 1: "Should be invalid";
        assert InputValidator.validateEmailAddress("test@.com") != 1: "Should be invalid";
        assert InputValidator.validateEmailAddress("@test.") != 1: "Should be invalid";
        assert InputValidator.validateEmailAddress("@test.com") != 1: "Should be invalid";
        assert InputValidator.validateEmailAddress("tester@@test.com") != 1: "Should be invalid";

        assert InputValidator.validateEmailAddress("tester@test.com") == 1: "Should return be valid";
    }

    @Test
    public void existenceCorrectlyValidated() {
        assert InputValidator.validateExistence(null) != 1: "Should be invalid";
        assert InputValidator.validateExistence("") != 1: "Should be invalid";

        assert InputValidator.validateExistence("a") == 1: "Should return be valid";
    }





    @Test
    public void nameGivesCorrectError() {
        assert InputValidator.validateName(null) == 0: "Should return 0";
        assert InputValidator.validateName("") == -1: "Should return -1";
        assert InputValidator.validateName("lowercasetest") == -2: "Should return -2";
        assert InputValidator.validateName("lOwERcaSeTESTtwO") == -2: "Should return -2";
        assert InputValidator.validateName("lOwERcaSeTESTthr33") == -2: "Should return -2";
        assert InputValidator.validateName("Sp3ci@l") == -3: "Should return -3";

        assert InputValidator.validateName("Tim-Thomson") == 1: "Should be valid";
        assert InputValidator.validateName("Bobby") == 1: "Should be valid";
        assert InputValidator.validateName("Billy Bob") == 1: "Should be valid";
    }

    @Test
    public void passwordGivesCorrectError() {
        assert InputValidator.validatePassword(null) == 0: "Should return 0";
        assert InputValidator.validatePassword("") == -1: "Should return -1";
        assert InputValidator.validatePassword("1234567") == -1: "Should return -1";
        assert InputValidator.validatePassword("123456@") == -1: "Should return -1";
        assert InputValidator.validatePassword("12345678") == -2: "Should return -2";

        assert InputValidator.validatePassword("1234567@") == 1: "Should return be valid";
    }

    @Test
    public void phoneNumberGivesCorrectError() {
        assert InputValidator.validatePhoneNumber(null) == 0: "Should return 0";
        assert InputValidator.validatePhoneNumber("") == -2: "Should return -2";
        assert InputValidator.validatePhoneNumber("12345") == -2: "Should return -2";
        assert InputValidator.validatePhoneNumber("123456789@") == -1: "Should return -1";
        assert InputValidator.validatePhoneNumber("123456789A") == -1: "Should return -1";

        assert InputValidator.validatePhoneNumber("1234567890") == 1: "Should return be valid";
    }

    @Test
    public void emailAddressGivesCorrectError() {
        assert InputValidator.validateEmailAddress(null) == 0: "Should return 0";
        assert InputValidator.validateEmailAddress("") == -1: "Should return -1";
        assert InputValidator.validateEmailAddress("@") == -1: "Should return -1";
        assert InputValidator.validateEmailAddress(".") == -1: "Should return -1";
        assert InputValidator.validateEmailAddress("@.") == -2: "Should return -2";
        assert InputValidator.validateEmailAddress("tester@.") == -3: "Should return -3";
        assert InputValidator.validateEmailAddress("tester@test.") == -4: "Should return -4";
        assert InputValidator.validateEmailAddress("test@.com") == -3: "Should return -3";
        assert InputValidator.validateEmailAddress("@test.") == -2: "Should return -2";
        assert InputValidator.validateEmailAddress("@test.com") == -2: "Should return -2";
        assert InputValidator.validateEmailAddress("tester@@test.com") == -5: "Should return -5";

        assert InputValidator.validateEmailAddress("tester@test.com") == 1: "Should return be valid";
    }

    @Test
    public void existenceGivesCorrectError() {
        assert InputValidator.validateExistence(null) == 0: "Should be invalid";
        assert InputValidator.validateExistence("") == -1: "Should be invalid";

        assert InputValidator.validateExistence("a") == 1: "Should return be valid";
    }

}
