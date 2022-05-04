import java.util.*;
import java.util.stream.*;
public class TotalStream{
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,15);
            long count =  myList.stream()
            .count();
            System.out.println(count);                    
    }
}
//
C:\Users\SC67784\repo\SAMPLE>javac TotalStream.java

C:\Users\SC67784\repo\SAMPLE>java TotalStream.java
8