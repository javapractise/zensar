

//Q8 Given a list of integers, sort all the values present in it using Stream functions?

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class SortListINt {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

             myList.stream()
                   .sorted()
                   .forEach(System.out::println);
    }
}