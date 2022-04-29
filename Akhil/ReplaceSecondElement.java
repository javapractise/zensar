package training11;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceSecondElement {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(3);
		arr.add(5);
		arr.add(2);
		arr.add(7);
		arr.add(0);
		arr.add(6);
		
		System.out.println("Original Array: " + arr);
		arr.set(1, 22);
		System.out.println("Modified Array: " + arr);

	}

}
