import java.util.*;
import java.util.stream.*;
public class DuplicateElement
{
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(22,8,22,25,98,98,32,15);
            Set<Integer> set = new HashSet();
            myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);
    }
}
//
C:\Users\SC67784\repo\SAMPLE>javac DuplicateElement.java
C:\Users\SC67784\repo\SAMPLE>java DuplicateElement.java
22
98