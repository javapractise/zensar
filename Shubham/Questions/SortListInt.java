import java.util.*;

public class SortListInt {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

             myList.stream()
                   .sorted()
                   .forEach(System.out::println);
    }
}