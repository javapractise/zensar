package vinaytest16;
import java.util.*;
public class NumberStartWith1 {
	    public static void main(String args[]) {
	            List<Integer> myList = Arrays.asList(198,23,168,50,145);
	            myList.stream()
	                  .map(s -> s + "") // Convert integer to String
	                  .filter(s -> s.startsWith("1"))
	                  .forEach(System.out::println);
	    
	}
}