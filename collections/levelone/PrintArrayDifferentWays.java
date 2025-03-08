package com.bridgelabz.collections.levelone;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PrintArrayDifferentWays {

    public static void PrintUsingRecursion(ArrayList<Integer> arr, int index){
        if(index > arr.size() - 1){
            return;
        }
        System.out.println(arr.get(index));
        index++;
        PrintUsingRecursion(arr,index);

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        System.out.println("-----------------------");

        int index = 0;
        while(index <= arr.size() - 1){
            System.out.println(arr.get(index));
            index++;
        }
        System.out.println("-----------------------");

        ListIterator<Integer> temp = arr.listIterator();
        while(temp.hasNext()){
            System.out.println(temp.next());
        }
        System.out.println("-----------------------");

        for(Integer num : arr){
            System.out.println(num);
        }
        System.out.println("-----------------------");

        PrintUsingRecursion(arr,0);

        System.out.println("-----------------------");

    }
}
