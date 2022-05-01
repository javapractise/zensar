package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(6);
		list.add(1);
		list.add(3);
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}
