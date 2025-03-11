package com.bridgelabz.regex.levelone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String inputEmail = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3}){1,2}$");
        Matcher m = pattern.matcher(inputEmail);
        System.out.println(m.matches());
        scanner.close();
    }
}
