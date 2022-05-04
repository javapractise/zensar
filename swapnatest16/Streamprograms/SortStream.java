import java.util.*;
import java.util.stream.*;
import java.util.function.Function;


public class SortStream
 {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(20,15,88,40,89,9,100,92,05);

             myList.stream()
                   .sorted()
                   .forEach(System.out::println);
    }
}
//
C:\Users\SC67784\repo\SAMPLE>javac SortStream.java

C:\Users\SC67784\repo\SAMPLE>java SortStream.java
5
9
15
20
40
88
89
92
100