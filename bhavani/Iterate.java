import java.util.*;
public class Iterate
{
public static void main(String args[])
{
LinkedList<Integer>list = new LinkedList<>();
list.add(10);
list.add(30);
list.add(50);
list.add(100);
iterateUsingForLoop(list);
}
public static void iterateUsingForLoop(LinkedList<Integer>list)
{
for(int i=0;i<list.size();i++)
{
System.out.print(list.get(i)+" ");
}
}
}