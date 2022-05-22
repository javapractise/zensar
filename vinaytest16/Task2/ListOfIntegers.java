package vinaytest16;
import java.util.*;

public class ListOfIntegers {

	    public static void main(String args[]) {
	            List<Integer> myList = Arrays.asList(11,321,154,14323,3);
	             myList.stream()
	                   .sorted()
	                   .forEach(System.out::println);
	    }
	}