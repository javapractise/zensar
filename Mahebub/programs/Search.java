package programs;

import java.util.ArrayList;

public class Search {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(21);
		list.add(32);
		list.add(53);
		list.add(26);
		list.add(78);
		
		System.out.println(list.indexOf(53));
	}

}
