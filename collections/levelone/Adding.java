package com.bridgelabz.collections.levelone;

public class Adding {
    public static <T extends Number> double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    public static void main(String[] args) {
        System.out.println(add(5, 10));
        System.out.println(add(5.5, 2.3));
        System.out.println(add(3.2f, 2.8f));
    }
}
