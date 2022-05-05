Given a list of integers, find out all the even numbers exist in the list using Stream functions?

import java.util.*;
import java.util.stream.*;
public class Javaprogram1 {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(14,31,4,49,25,98,74);
            myList.stream()
                  .filter(n -> n%2 == 0)
                  .forEach(System.out::println);
    }
}