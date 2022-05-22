package vinaytest16;
import java.util.*;
public class MaximumValue {
	    public static void main(String args[]) {
	            List<Integer> myList = Arrays.asList(543,45,62,754,893,33);
	            int max =  myList.stream()
	                             .max(Integer::compare)
	                             .get();
	            System.out.println(max);                    
	    }
}