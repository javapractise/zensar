package practice;
import java.util.*;
import java.util.Arrays;
public class Arraylist{
public static void main(String[] args) {
List<Integer> myList = Arrays.asList(10,15,22,23);
myList.stream().map(s -> s + "")
.filter(s -> s.startsWith("1")),
.forEach(System.out :: println));
}
}