package programs;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(27);
		list.add(41);
		list.add(78);
		list.add(57);
		list.add(15);
		
		Collections.shuffle(list);
		
		System.out.println(list);
	}

}
