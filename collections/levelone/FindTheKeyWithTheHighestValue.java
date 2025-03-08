package com.bridgelabz.collections.levelone;

import java.util.*;


public class FindTheKeyWithTheHighestValue {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = "";
        int maxValue = Integer.MIN_VALUE;

        for(HashMap.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println("The key with the maximum values is: " + maxKey);
    }
}
