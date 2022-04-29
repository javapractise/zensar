package training11;

import java.util.ArrayList;

public class CopyArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> firstArr = new ArrayList<Integer>();
		
		firstArr.add(3);
		firstArr.add(5);
		firstArr.add(2);
		firstArr.add(7);
		firstArr.add(0);
		firstArr.add(6);
		
		ArrayList<Integer> secondArr = new ArrayList<Integer>(firstArr);
		
		System.out.println("First Array: " + firstArr);
		System.out.println("Second Array: " + secondArr);

	}

}
