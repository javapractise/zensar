import java.util.*;
import java.util.stream.Collectors;
  
public class Distict {
    public static void main(String args[])
    {
  
        
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
 System.out.println( numbers.stream()
                     .distinct()
                     .map(n -> n+"\t"+n*n) 
                     .collect(Collectors.joining("\n")) 
                   );
}
}