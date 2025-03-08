package com.bridgelabz.collections.levelone;

import java.util.Arrays;
import java.util.HashSet;

public class UnionAndIntersectionOfTwoSets {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,4,6,8));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(8,12,14,15));

        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        HashSet<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);

    }
}
