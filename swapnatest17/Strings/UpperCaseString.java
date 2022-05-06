import java.util.*;
  
public class UpperCaseString
 {
    public static void main(String args[])
    {
  
       
        List<String> list = new ArrayList<>( Arrays.asList("Good","Morning","Everyone"));
        System.out.println("List of String: " + list);
		String string = String.join(", ", list);
        System.out.println("Comma separated String: "
                           + string);
    }
}
//
C:\Users\SC67784\repo\SAMPLE>javac UpperCaseString.java

C:\Users\SC67784\repo\SAMPLE>java UpperCaseString.java
List of String: [Good, Morning, Everyone]
Comma separated String: Good, Morning, Everyone
