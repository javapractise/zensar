package training11;

import java.util.LinkedList;

public class FirstLastElements {

	public static void main(String[] args) {
		
		LinkedList<Integer> arr = new LinkedList<Integer>();

		arr.add(3);
		arr.add(5);
		arr.add(2);
		arr.add(7);
		arr.add(0);
		arr.add(6);
		
		System.out.println("First occurrence: " + arr.getFirst());
		System.out.println("First occurrence: " + arr.getLast());

	}

}
