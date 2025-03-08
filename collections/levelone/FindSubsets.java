package com.bridgelabz.collections.levelone;

import java.util.*;

public class FindSubsets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in Set1:");
        int size1 = scanner.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        System.out.println("Enter elements of Set1:");
        for (int i = 0; i < size1; i++) {
            set1.add(scanner.nextInt());
        }

        System.out.println("Enter the number of elements in Set2:");
        int size2 = scanner.nextInt();
        HashSet<Integer> set2 = new HashSet<>();
        System.out.println("Enter elements of Set2:");
        for (int i = 0; i < size2; i++) {
            set2.add(scanner.nextInt());
        }

        Boolean isSubset = set1.containsAll(set2);

        System.out.println("Is a subset True/False: " + isSubset);
    }
}
