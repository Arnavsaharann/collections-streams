package com.bridgelabz.collections.levelone;

import java.util.LinkedList;
import java.util.*;

public class GenerateBinaryNumbersUsingQueue {
    public static List<String> generatecombinations(int n){
        List<String> arr = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer("1");

        while(n != 0){
            String binary = queue.poll();
            arr.add(binary);

            queue.offer(binary + "0");
            queue.offer(binary + "1");
            n--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(generatecombinations(n));
    }
}
