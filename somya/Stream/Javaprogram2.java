Given a list of integers, find out all the numbers starting with 1 using Stream functions?

import java.util.*;
import java.util.stream.*;
public class Javaprogram2 {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
            myList.stream()
                  .map(s -> s + "") // Convert integer to String
                  .filter(s -> s.startsWith("1"))
                  .forEach(System.out::println);
    }
}