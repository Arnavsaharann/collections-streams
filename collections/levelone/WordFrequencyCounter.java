package com.bridgelabz.collections.levelone;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String path = "/Users/arnavsaharan/Desktop/JavaClassroom/src/com/bridgelabz/collections/levelone/example.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            HashMap<String, Integer> wordCount = new HashMap<>();
            String line;
            while((line = reader.readLine()) != null ){
                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z ]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        if (wordCount.containsKey(word)) {
                            wordCount.put(word, wordCount.get(word) + 1);
                        } else {
                            wordCount.put(word, 1);
                        }
                    }
                }
            }

            System.out.println("Word Frequencies: " + wordCount);

        }catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());

        }
    }
}
