package com.bridgelabz.regex.levelone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidFirstName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher m = p.matcher(firstName);
        System.out.println(m.matches());
        scanner.close();
    }
}


