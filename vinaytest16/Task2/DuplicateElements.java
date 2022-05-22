package vinaytest16;
import java.util.*;
public class DuplicateElements {
	    public static void main(String args[]) {
	            List<Integer> myList = Arrays.asList(1,5643,234,653,234,1,2);
	            Set<Integer> set = new HashSet<Integer>();
	            myList.stream()
	                  .filter(n -> !set.add(n))
	                  .forEach(System.out::println);
	    }
	}