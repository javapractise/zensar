package training11;

import java.util.ArrayList;

public class CloneArray {

	public static void main(String[] args) {

		ArrayList<Integer> firstArr = new ArrayList<Integer>();

		firstArr.add(3);
		firstArr.add(5);
		firstArr.add(2);
		firstArr.add(7);
		firstArr.add(0);
		firstArr.add(6);

		@SuppressWarnings("unchecked")
		ArrayList<Integer> secondArr = (ArrayList<Integer>)firstArr.clone();
		
		firstArr.add(11);
		firstArr.add(16);

		System.out.println("First Array: " + firstArr);
		System.out.println("Second Array: " + secondArr);

	}

}
