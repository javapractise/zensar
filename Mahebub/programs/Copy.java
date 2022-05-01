package programs;

import java.util.ArrayList;
import java.util.Collections;

public class Copy {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(27);
		list1.add(41);
		list1.add(78);
		list1.add(57);
		list1.add(15);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		Collections.copy(list2, list1);
		
		System.out.println(list2);
	}

}
