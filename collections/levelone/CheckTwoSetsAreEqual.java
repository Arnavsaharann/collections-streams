package com.bridgelabz.collections.levelone;

import java.util.Arrays;
import java.util.HashSet;

public class CheckTwoSetsAreEqual {

    // can also use .equals()
    public static <T> Boolean isEqual(HashSet<T> set1, HashSet<T> set2){
        HashSet<T> first = new HashSet<>(set1);
        HashSet<T> second = new HashSet<>(set2);

        if(first.size() != second.size()) return false;

        for(T element : first){
            if(!second.contains(element)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,5,7,2));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,7,3,2,5));

        Boolean areEqual= isEqual(set1, set2);

        System.out.println(areEqual);

    }
}
