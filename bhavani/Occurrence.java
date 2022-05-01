import java.util.*;
public class Occurrence
{
public static void main(String args[])
{
LinkedList<Integer>list = new LinkedList<>();
list.add(10);
list.add(30);
list.add(50);
list.add(100);
System.out.println("first occurrence:"+list.getFirst());
System.out.println("Last occurrence:"+list.getLast());
}
}