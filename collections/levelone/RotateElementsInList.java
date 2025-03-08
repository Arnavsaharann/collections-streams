package com.bridgelabz.collections.levelone;
import java.util.*;

public class RotateElementsInList {
    public static <T> void rotateList(List<T> list, int positions) {
        int size = list.size();
        positions = positions % size; // Handle cases where positions > size

        // Reverse the entire list first
        Collections.reverse(list);
        // Reverse the first 'positions' elements
        Collections.reverse(list.subList(0, positions));
        // Reverse the remaining elements
        Collections.reverse(list.subList(positions, size));
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;

        rotateList(list, rotateBy);
        System.out.println("Rotated List: " + list);
    }
}
