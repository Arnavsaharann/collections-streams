package com.bridgelabz.collections.levelone;
import java.util.*;

public class RemoveDuplicates {
    public static <T> List<T> removeDuplicates(List<T> list) {
        LinkedHashSet<T> set = new LinkedHashSet<>(list);

        ArrayList<T> result = new ArrayList<>(set);

        return result;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20, 40, 50, 30));
        List<Integer> result = removeDuplicates(list);
        System.out.println("List after removing duplicates: " + result);
    }
}