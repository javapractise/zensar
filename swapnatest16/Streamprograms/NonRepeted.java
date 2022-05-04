import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class NonRepeted {
    public static void main(String args[]) {
            String input = "java microservices training";

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
///
C:\Users\SC67784\repo\SAMPLE>javac NonRepeted.java

C:\Users\SC67784\repo\SAMPLE>java NonRepeted.java
j
