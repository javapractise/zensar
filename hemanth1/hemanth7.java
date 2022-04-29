package arraylist;
import java.util.*;


public class search{

public static void main(String[] args) {
ArrayList <Integer> list1 = new ArrayList<Integer>();
list1.add(10);
list1.add(11);
list1.add(15);
list1.add(20);
list1.add(25);
System.out.println("arraylist:" +list1);
String new_list1 = 30;
list1.set(3, new_list1);
int num= list1.size();
System.out.println("replace fourth element with '45' :");
for(int i=0;i<num;i++)
{
System.out.println(list1.get(i));
}
}



}