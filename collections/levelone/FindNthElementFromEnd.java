package com.bridgelabz.collections.levelone;

import java.util.*;

public class FindNthElementFromEnd {

    public static <T> T findNthFromEnd(List<T> list, Integer n){
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();


        for (int i = 0; i < n; i++) {
            if (first.hasNext()) {
                first.next();
            } else {
                throw new NoSuchElementException("N is greater than the list size");
            }
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next(); // second now points to the Nth element from the end

    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,3,4,5,6,7,8));
        int n = 2;

        System.out.println("Nth element from the end: " + findNthFromEnd(list, n)); // Output:
    }
}
