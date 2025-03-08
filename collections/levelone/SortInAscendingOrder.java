package com.bridgelabz.collections.levelone;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInAscendingOrder {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(2);
        arr.add(5);
        arr.add(1);
        arr.add(8);

        Collections.sort(arr,(a,b) -> b - a);
        System.out.println(arr);

    }
}
