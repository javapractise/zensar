package practice;
import java.util.*;
import java.util.Arrays;
public class Arraylist{

public static void main(String[] args) {
List<Integer> myList = Arrays.asList(10,15,22,23,23,67,16,16);
int elementGreaterThanFive = myList.stream ()
.peek(num -> System.out.println("filtering" +num))
.filter(x -> x >5)
.findFirst()
.get();
System.out.println("elementGreaterThanFive");
}
}