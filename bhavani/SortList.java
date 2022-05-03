import java.util.*;
import java.util.stream.*;
public class SortList
{
public static void main(String args[])
{
List<String>slist=Arrays.asList("bhavani","jinde","suman","surya");
List<String>sortedList=slist.stream().sorted().collect(Collectors.toList());
sortedList.forEach(System.out::println);
}
}