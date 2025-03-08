package com.bridgelabz.collections.levelone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher m = p.matcher("Arnav");
        System.out.println(m.find());
    }
}

