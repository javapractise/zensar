package vinaytest16;
import java.util.*;
public class FirstElement {
	    public static void main(String args[]) {
	            List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,91,2);
	            myList.stream()
	                  .findFirst()
	                  .ifPresent(System.out::println);
	    }
	}