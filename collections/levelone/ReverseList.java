package com.bridgelabz.collections.levelone;

import java.util.*;


public class ReverseList {

    public static <T> void reverseList(List<T> list){
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(7);
        reverseList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(10);
        linkedlist.add(20);
        linkedlist.add(30);
        linkedlist.addFirst(5);  // Adds at the beginning
        linkedlist.addLast(40);   // Adds at the end
        linkedlist.add(2, 25);    // Adds at index 2
        reverseList(linkedlist);
        System.out.println("Reversed LinkedList: " + linkedlist);
    }
}
