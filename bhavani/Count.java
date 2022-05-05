import java.util.*;
import java.util.stream.*;
public class Count
{
public static void main(String args[])
{
List<Integer>myList=Arrays.asList(10,15,8,29,26,31,10,8);
long count = myList.stream()
.count();
System.out.println(count);
}
}