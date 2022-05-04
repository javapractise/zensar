import java.util.*;
import java.util.stream.*;
public class Even
{
public static void main(String args[])
{
List<Integer>myList=Arrays.asList(10,15,8,29,26,31);
myList.stream()
.filter(n->n%2==0)
.forEach(System.out::println);
}
}