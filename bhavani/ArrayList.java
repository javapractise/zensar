import java.util.ArrayList;
import java.util.List;

public class ArrayList
{
public static void main(String args[])
{
ArrayList<Integer>r1=new ArrayList<Integer>();
r1.add(10);
r1.add(20);
r1.add(30);
r1.add(40);
r1.add(50);
for(int s :r1)
System.out.println(s);
ArrayList<Integer>list=r1;
System.out.println("Iterating...");
list.stream().forEach(elem->System.out.println(elem));
}
}

