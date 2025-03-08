package com.bridgelabz.collections.levelone;

import java.util.*;

interface KanikaAgarwal {
    void speakGaliya();

}

public class Example {
    public static void main(String[] args) {
        KanikaAgarwal kanika = () -> System.out.println("Kanika is speaking galiya.");

        kanika.speakGaliya();

    }
}