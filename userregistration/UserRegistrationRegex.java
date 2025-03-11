package com.bridgelabz.userregistration;

import java.util.Scanner;

public class UserRegistrationRegex {

    // Method to validate First Name
    public boolean validateFirstName(String firstName) throws InvalidFirstNameException {
        if (!firstName.matches("^[A-Z][a-z]{2,}$")) {
            throw new InvalidFirstNameException("Invalid First Name: " + firstName);
        }
        return true;
    }

    // Method to validate Last Name
    public boolean validateLastName(String lastName) throws InvalidLastNameException {
        if (!lastName.matches("^[A-Z][a-z]{2,}$")) {
            throw new InvalidLastNameException("Invalid Last Name: " + lastName);
        }
        return true;
    }

    // Method to validate Mobile Number (with country code)
    public boolean validateMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
        if (!mobileNumber.matches("^\\+91\\s[0-9]{10}$")) {
            throw new InvalidMobileNumberException("Invalid Mobile Number: " + mobileNumber);
        }
        return true;
    }

    // Method to validate Password (at least 8 chars, 1 uppercase, 1 digit, 1 special char)
    public boolean validatePassword(String password) throws InvalidPasswordException {
        if (!password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=]).{8,}$")) {
            throw new InvalidPasswordException("Invalid Password: " + password);
        }
        return true;
    }

    // Method to validate Email
    public boolean validateEmail(String email) throws InvalidEmailException {
        if (!email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3}){1,2}$")) {
            throw new InvalidEmailException("Invalid Email: " + email);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistrationRegex validator = new UserRegistrationRegex();

        try {
            // First Name Validation
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            validator.validateFirstName(firstName);
            System.out.println("Valid First Name");

            // Last Name Validation
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();
            validator.validateLastName(lastName);
            System.out.println("Valid Last Name");

            // Mobile Number Validation
            System.out.print("Enter Mobile Number (with country code): ");
            String mobileNumber = scanner.nextLine();
            validator.validateMobileNumber(mobileNumber);
            System.out.println("Valid Mobile Number");

            // Email Validation
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            validator.validateEmail(email);
            System.out.println("Valid Email");

            // Password Validation
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();
            validator.validatePassword(password);
            System.out.println("Valid Password");

        } catch (InvalidFirstNameException | InvalidLastNameException | InvalidMobileNumberException
                 | InvalidEmailException | InvalidPasswordException e) {
            // Handle all invalid detail exceptions here
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
