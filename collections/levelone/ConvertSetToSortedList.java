package com.bridgelabz.collections.levelone;

import java.util.*;

public class ConvertSetToSortedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashset = new HashSet<>();


        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();


        System.out.println("Enter the elements now: ");
        for(int i = 0; i < size; i++){
            hashset.add(scanner.nextInt());
        }

        TreeSet<Integer> treeSet = new TreeSet<>(hashset);

        System.out.println(treeSet);
    }
}
