package vinaytest16;
import java.util.*;
public class Even {
	    public static void main(String args[]) {
	            List<Integer> myList = Arrays.asList(75,76,2323,6546,234,5632);
	            myList.stream()
	                  .filter(n -> n%2 == 0)
	                  .forEach(System.out::println);
	    }
}
