package com.bridgelabz.collections.levelone;

import java.util.*;
public class MergeTwoMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> firstMap = new HashMap<>();
        firstMap.put("A", 1);
        firstMap.put("B", 2);
        HashMap<String, Integer> secondMap = new HashMap<>();
        secondMap.put("B", 3);
        secondMap.put("C", 4);

        for(Map.Entry<String,Integer> entry : firstMap.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();

            if(secondMap.containsKey(key)){
                int newValue = secondMap.get(key) + value;
                secondMap.put(key,newValue);
            }else{
                secondMap.put(key,value);
            }
        }

        System.out.println(secondMap);
    }
}
