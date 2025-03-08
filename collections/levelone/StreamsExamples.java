package com.bridgelabz.collections.levelone;

import java.util.stream.IntStream;

public class StreamsExamples {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100).forEach(i -> System.out.println(i));

    }
}
