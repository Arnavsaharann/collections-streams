package com.bridgelabz.collections.levelone;

import java.util.*;
/*
class Compare implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return b - a;
    }
}
*/


public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(1);
        arr.add(8);
        arr.add(2);
        arr.add(3);

        //Compare customComparator = new Compare();

        System.out.println(arr);
        System.out.println("-----------------------------");
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("-----------------------------");
        Collections.sort(arr,( Integer a,  Integer b) -> b - a);
        System.out.println(arr);

    }
}
