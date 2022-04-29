package arraylist;
import java.util.*;
public class CompareArray {

public static void main(String[] args) {
ArrayList <Integer> list1 = new ArrayList<Integer>();
list1.add(10);
list1.add(11);
list1.add(15);
list1.add(20);
list1.add(25);
ArrayList <String> list2 = new ArrayList<String>();
list1.add(10);
list1.add(11);
list1.add(15);
list1.add(20);
list1.add(25);
boolean value = list1.equals(list2);
System.out.println(value);
}



}