import java.util.*;
import java.util.stream.*;
public class Integer2 {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(22,7,45,21,18,4,7,20,65,10);
            myList.stream()
                  .map(s -> s + "") // Convert integer to String
                  .filter(s -> s.startsWith("1"))
                  .forEach(System.out::println);
    }
}