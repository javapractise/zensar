package arraylist;
import java.util.*;

public class IterateArray {

public static void main(String[] args) {
LinkedList <Integer> list1 = new LinkedList<Integer>();
list1.add(10);
list1.add(11);
list1.add(15);
list1.add(20);
list1.add(25);
Iterator itr = list1.listIterator(1);
while(itr.hasNext()) {
System.out.println(itr.next());
}

}



}