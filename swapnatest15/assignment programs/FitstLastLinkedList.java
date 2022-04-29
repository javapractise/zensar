import java.util.LinkedList;
import java.util.Iterator;
class FitstLastLinkedList
  {
		public static void main(String[] args)
		{
   
			LinkedList<String> l_list = new LinkedList<String>();
   
			l_list.add("swapna");
			l_list.add("sunitha");
			l_list.add("suresh");
			l_list.add("teja");
			l_list.add("gopi krishna");
		  
			System.out.println("Original linked list:" + l_list);  
			Object first_element = l_list.getFirst();
			System.out.println("First Element is: "+first_element);
			Object last_element = l_list.getLast();
			System.out.println("Last Element is: "+last_element);
		}
}
//
C:\Users\SC67784\repo\SAMPLE>javac FitstLastLinkedList.java

C:\Users\SC67784\repo\SAMPLE>java FitstLastLinkedList.java
Original linked list:[swapna, sunitha, suresh, teja, gopi krishna]
First Element is: swapna
Last Element is: gopi krishna