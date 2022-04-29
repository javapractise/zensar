import java.util.*;
public class ReverseElements
{
public static void main(String args[])
{
List<String>list=new ArrayList<String>();
list.add("bhavani");
list.add("company");
list.add("technology");
list.add("zensar");

System.out.println("before reverse");
System.out.println(list.toString());
Collections.reverse(list);
System.out.println("After reversing");
System.out.println(list);
}
}