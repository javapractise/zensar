import java.util.*;
public class ListInteger
 {
    public static void main(String args[]) 
	{
        List<Integer> myList = Arrays.asList(10,20,30,40,50,60,70);
        myList.stream()
            .filter(n -> n%2 == 0)
            .forEach(System.out::println);
    }
}
///
C:\Users\SC67784\repo\SAMPLE>javac ListInteger.java

C:\Users\SC67784\repo\SAMPLE>java ListInteger.java
10
20
30
40
50
60
70