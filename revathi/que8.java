package practice;
import java.util.*;
import java.util.Arrays;
public class Arraylist{
public static void main(String[] args) {
List<Integer> myList = Arrays.asList(10,15,22,23,23,67,16,16);
Set<Integer> set = new HashSet<>();
myList.stream().filter(n->!set.add(n)).forEach(System.out :: println);
}
}