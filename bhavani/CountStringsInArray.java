package com.java8.array;

import java.util.Arrays;
import java.util.List;

public class CountStringsInArray {

    public static void main(String[] args) {
        List<String> arrStr = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        
        long count = arrStr.stream().filter(x -> x.isEmpty()).count();
        System.out.println("Empty Count: " + count);
    }

}