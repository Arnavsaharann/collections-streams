package com.bridgelabz.collections.levelone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfElements {
    public static Map<String,Integer> countFrequency(ArrayList<String> list){
        Map<String,Integer> mp = new HashMap<>();

        for(String s : list){
            if (mp.containsKey(s)) {
                mp.put(s, mp.get(s) + 1);
            } else {
                mp.put(s, 1);
            }
        }
        return mp;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");

        Map<String, Integer> result = countFrequency(words);

        System.out.println(result);
    }
}
