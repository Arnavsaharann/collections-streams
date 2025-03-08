package com.bridgelabz.collections.levelone;

import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        map.put("D", 3);
        map.put("E", 2);

        Map<Integer, List<String>> invertedMap = invertMap(map);

        System.out.println(invertedMap);
    }

    public static  HashMap<Integer, List<String>> invertMap(HashMap<String,Integer> map) {
        HashMap<Integer, List<String>> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue(); // Extracting value
            String key = entry.getKey(); // Extracting key

            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }

            // Add the key to the list corresponding to the value
            invertedMap.get(value).add(key);
        }

        return invertedMap;

    }
}
