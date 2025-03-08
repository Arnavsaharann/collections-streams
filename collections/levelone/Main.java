package com.bridgelabz.collections.levelone;

import java.util.*;

interface Kanika{
    void speakGaliya();
    void watchGetReadyWithMe();
}

public class Main {
    public static void main(String[] args) {
        Kanika kanika = new Kanika() {
            @Override
            public void speakGaliya() {
                System.out.println("Kanika is speaking galiya.");
            }

            @Override
            public void watchGetReadyWithMe() {
                System.out.println("Kanika is watching 'Get Ready With Me' videos.");
            }
        };

        kanika.speakGaliya();
        kanika.watchGetReadyWithMe();
    }
}
