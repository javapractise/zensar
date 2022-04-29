package programs;

import java.util.ArrayList;

public class Clone {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		list1.add(27);
		list1.add(41);
		list1.add(78);
		list1.add(57);
		list1.add(15);
		System.out.println("Original list: "+list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2 = (ArrayList<Integer>)list1.clone();
		System.out.println("Cloned list: "+list2);
	}
}
