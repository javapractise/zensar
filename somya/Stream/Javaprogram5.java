Given a list of integers, find the total number of elements present in the list using Stream functions?


import java.util.*;
import java.util.stream.*;
public class Javaprogram5 {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
            long count =  myList.stream()
                                .count();
            System.out.println(count);                    
    }
}
