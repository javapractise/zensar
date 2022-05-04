import java.util.*;
import java.util.stream.*;
public class FirstElement {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(21,15,8,9,25,98,32,19);
            myList.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}//
C:\Users\SC67784\repo\SAMPLE>javac FirstElement.java

C:\Users\SC67784\repo\SAMPLE>java FirstElement.java
21