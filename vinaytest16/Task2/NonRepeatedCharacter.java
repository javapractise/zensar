package vinaytest16;
import java.util.*;
import java.util.stream.*;
import java.util.function.Function;
public class NonRepeatedCharacter {
 public static void main(String args[]) {
	        String input = "league of legends";
	      Character result = input.chars() // Stream of String       
	                      .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))          
	                      .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) 
	                      .entrySet()
	                      .stream()
	                      .filter(entry -> entry.getValue() == 1L)
	                      .map(entry -> entry.getKey())
	                      .findFirst()
	                      .get();
	   System.out.println(result);                    
 }
}
