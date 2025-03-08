package com.bridgelabz.collections.levelone;


interface A{
    void print(String name);
}

public class NullPtrException {
    public static void main(String[] args) {

        A obj = (String name)  -> {
            System.out.println(name);
            System.out.println(name);
        };
        obj.print("Arnav Saharan");
    }
}