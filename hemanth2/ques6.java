package practice;
import java.util.*;
import java.util.Arrays;
public class Even{
public static void main(String[] args) {
List<Integer> myList = Arrays.asList(10,15,22,23);
myList.stream().filter(n -> n%2 == 0).forEach(System.out :: println);
}
}