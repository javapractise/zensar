import java.util.*;
import java.util.stream.*;



public class Decending
{
public static void main(String args[])
{
List<Integer>myList=Arrays.asList(10,15,8,29,26,31,10,8);
myList.stream()
.sorted()
.forEach(System.out::println);
}
}