import java.util.*;
public class SearchArrayList
{
public static void main(String args[])
{
LinkedList<Integer>list = new LinkedList<>();
list.add(10);
list.add(30);
list.add(50);
list.add(100);
if(list.contains(50))
{
System.out.println("the element is found");
}
else
{
System.out.println("the element is not  found");
}
}
}