// Given a String, find the first non-repeated character in it using Stream functions?

package javaprogram;

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class Stream7 {
    public static void main(String args[]) {
            String input = "Java is Awesome Language";

            Character result = input.chars() // Stream of String       
                                    .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                                    .entrySet()
                                    .stream()
                                    .filter(entry -> entry.getValue() == 1L)
                                    .map(entry -> entry.getKey())
                                    .findFirst()
                                    .get();
            System.out.println(result);                    
    }
}
