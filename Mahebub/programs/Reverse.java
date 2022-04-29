package programs;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(27);
		list.add(41);
		list.add(78);
		list.add(57);
		list.add(15);
		
		System.out.println("Original list: "+list);
		Collections.reverse(list);
		System.out.println("Reversed list: "+list);
	}

}
