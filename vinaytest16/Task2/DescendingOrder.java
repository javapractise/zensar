package vinaytest16;
import java.util.*;
public class DescendingOrder {

	    public static void main(String args[]) {
	            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
	             myList.stream()
	                   .sorted(Collections.reverseOrder())
	                   .forEach(System.out::println);
	    }
}