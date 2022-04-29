package training11;

import java.util.LinkedList;
import java.util.Iterator;

public class ListIterator {

	public static void main(String[] args) {

		LinkedList<Integer> arr = new LinkedList<Integer>();

		arr.add(3);
		arr.add(5);
		arr.add(2);
		arr.add(7);
		arr.add(0);
		arr.add(6);
		
		Iterator<Integer> arrLoop = arr.iterator();
		
		while(arrLoop.hasNext()) {
			System.out.println(arrLoop.next());
		}

	}

}
