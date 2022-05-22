import java.util.*;
import java.util.stream.*;
public class Stream1 {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
            myList.stream()
                  .filter(n -> n%2 == 0)
                  .forEach(System.out::println);
    }
}