package programs;

import java.util.ArrayList;

public class Compare {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		list1.add(27);
		list1.add(41);
		list1.add(78);
		list1.add(57);
		list1.add(15);
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(27);
		list2.add(41);
		list2.add(78);
		list2.add(57);
		list2.add(15);
		System.out.println(list2);
		
		System.out.println(list1.equals(list2));
		list1.add(20);
		System.out.println(list1.equals(list2));
	}
}
