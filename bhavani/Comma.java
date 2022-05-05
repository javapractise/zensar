import java.util.*;
  
public class Comma {
    public static void main(String args[])
    {
  
        
        List<String>list = new ArrayList<>( Arrays.asList("java","progarm","Assignment"));
        
        
        System.out.println("List of String: " + list);
  
        String string = String.join(", ", list);
        System.out.println("Comma separated String: "+ string);
    }
}