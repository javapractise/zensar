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
ArrayList <Integer> list2 = new ArrayList<Integer>();
System.out.println("copy of Arraylist is :" +list2);
list1.add(55);
list1.remove(15);
System.out.println("Original arraylist" +list1);
System.out.println("cloned array" +list2);
}



}