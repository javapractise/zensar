import java.util.*;
import java.util.stream.*;
public class Duplicate
{
public static void main(String args[])
{
List<Integer>myList=Arrays.asList(10,15,8,29,26,31,10,8);
Set<Integer>set=new HashSet();
myList.stream()
.filter(n->!set.add(n))
.forEach(System.out::println);
}
}