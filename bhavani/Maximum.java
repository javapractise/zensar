import java.util.*;
import java.util.stream.*;
public class Maximum
{
public static void main(String args[])
{
List<Integer>myList=Arrays.asList(10,15,8,29,26,31,10,8);
int max = myList.stream()
.max(Integer::compare)
.get();
System.out.println(max);
}
}