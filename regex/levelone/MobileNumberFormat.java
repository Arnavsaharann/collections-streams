package com.bridgelabz.regex.levelone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberFormat {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\+?91\\s[0-9]{10}$");
        Matcher matcher = pattern.matcher("91 9678838220");
        System.out.println(matcher.matches());
    }
}
