import java.util.*;
import java.util.stream.*;
public class StartingOne
{
public static void main(String args[])
{
List<Integer>myList=Arrays.asList(10,15,8,29,26,31);
myList.stream()
.map(s->s+"")
.filter(s->s.startsWith("1"))
.forEach(System.out::println);
}
}