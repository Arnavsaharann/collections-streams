package com.bridgelabz.regex.levelone;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PasswordValidation {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(?=[^\\W]*[\\W][^\\W]*$)(?=.*[A-Z])(?=.*[0-9]).{8,}$");
        Matcher matcher = pattern.matcher("Noddy2003@1234");
        System.out.println(matcher.matches());
    }
}
