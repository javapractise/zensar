import java.util.*;
import java.util.stream.*;
public class Integer1 {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(2,10,13,7,09,34,21,6,8,14,26);
            myList.stream()
                  .filter(n -> n%2 == 0)
                  .forEach(System.out::println);
    }
}
