import java.util.*;
public class StreamFunction
 {
    public static void main(String args[]) 
	{
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
            myList.stream()
                .map(s -> s + "") 
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}
//C:\Users\SC67784\repo\SAMPLE>javac StreamFunction.java

C:\Users\SC67784\repo\SAMPLE>java StreamFunction.java
10
15