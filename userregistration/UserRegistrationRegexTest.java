package com.bridgelabz.userregistration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class UserRegistrationRegexTest {

    private UserRegistrationRegex validator;

    @BeforeEach
    void setup() {
        validator = new UserRegistrationRegex();
    }

    @Test
    void testValidFirstName_HappyCase() {
        assertDoesNotThrow(() -> validator.validateFirstName("Arnav"));
    }

    @Test
    void testInvalidFirstName_SadCase() {
        assertThrows(InvalidFirstNameException.class, () -> validator.validateFirstName("arnav"));
        assertThrows(InvalidFirstNameException.class, () -> validator.validateFirstName("A"));
        assertThrows(InvalidFirstNameException.class, () -> validator.validateFirstName("Ar"));
    }

    @Test
    void testValidLastName_HappyCase() {
        assertDoesNotThrow(() -> validator.validateLastName("Saharan"));
    }

    @Test
    void testInvalidLastName_SadCase() {
        assertThrows(InvalidLastNameException.class, () -> validator.validateLastName("saharan"));
        assertThrows(InvalidLastNameException.class, () -> validator.validateLastName("S"));
    }

    @Test
    void testValidMobileNumber_HappyCase() {
        assertDoesNotThrow(() -> validator.validateMobileNumber("+91 9876543210"));
    }

    @Test
    void testInvalidMobileNumber_SadCase() {
        assertThrows(InvalidMobileNumberException.class, () -> validator.validateMobileNumber("9876543210"));
        assertThrows(InvalidMobileNumberException.class, () -> validator.validateMobileNumber("+91-9876543210"));
        assertThrows(InvalidMobileNumberException.class, () -> validator.validateMobileNumber("+919876543210"));
    }

    @Test
    void testValidEmail_HappyCase() {
        assertDoesNotThrow(() -> validator.validateEmail("arnav.saharan@example.com"));
    }

    @Test
    void testInvalidEmail_SadCase() {
        assertThrows(InvalidEmailException.class, () -> validator.validateEmail("arnav.saharan@.com"));
        assertThrows(InvalidEmailException.class, () -> validator.validateEmail("arnav@com"));
        assertThrows(InvalidEmailException.class, () -> validator.validateEmail("arnav.saharan@@gmail.com"));
    }

    @Test
    void testValidPassword_HappyCase() {
        assertDoesNotThrow(() -> validator.validatePassword("Password@123"));
    }

    @Test
    void testInvalidPassword_SadCase() {
        assertThrows(InvalidPasswordException.class, () -> validator.validatePassword("password123"));
        assertThrows(InvalidPasswordException.class, () -> validator.validatePassword("PASSWORD123"));
        assertThrows(InvalidPasswordException.class, () -> validator.validatePassword("Pass@12"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"user@example.com", "john.doe@company.co", "valid.email@service.net"})
    void testValidEmails_Parameterized(String email) {
        assertDoesNotThrow(() -> validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"invalid.email.com", "@missingusername.com", "user@.com", "user@domain..com", "user@domain,com"})
    void testInvalidEmails_Parameterized(String email) {
        assertThrows(InvalidEmailException.class, () -> validator.validateEmail(email));
    }
}
