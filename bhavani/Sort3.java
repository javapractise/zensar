import java.util.*;
import java.util.stream.*;
import java.util.fuction.Function;


public class Sort3
{
public static void main(String args[])
{
List<Integer>myList=Arrays.asList(10,15,8,29,26,31,10,8);
myList.stream()
.sorted(Collections.reverseOrder())
.forEach(System.out::println);
}
}