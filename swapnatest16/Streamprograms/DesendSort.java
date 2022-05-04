import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class DesendSort {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(20,15,88,40,89,9,100,92,05);

             myList.stream()
            .sorted(Collections.reverseOrder())
            .forEach(System.out::println);
    }
}
//
C:\Users\SC67784\repo\SAMPLE>javac DesendSort.java

C:\Users\SC67784\repo\SAMPLE>java DesendSort.java
100
92
89
88
40
20
15
9
5