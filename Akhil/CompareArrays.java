package training11;

import java.util.ArrayList;

public class CompareArrays {

	public static void main(String[] args) {

		ArrayList<Integer> firstArr = new ArrayList<Integer>();

		firstArr.add(3);
		firstArr.add(5);
		firstArr.add(2);
		firstArr.add(7);
		firstArr.add(0);
		firstArr.add(6);

		ArrayList<Integer> secondArr = new ArrayList<Integer>();

		secondArr.add(3);
		secondArr.add(5);
		secondArr.add(2);
		secondArr.add(7);
		secondArr.add(0);
		secondArr.add(6);
		
		boolean check = firstArr.equals(secondArr);
		
		if(check) {
			System.out.println("Both array lists are same");
		} else {
			System.out.println("Both array lists are not same");
		}

	}

}
