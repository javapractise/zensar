package training11;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecificIndex {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter index position: ");
		int n = input.nextInt();
		input.close();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(3);
		arr.add(5);
		arr.add(2);
		arr.add(7);
		arr.add(0);
		arr.add(6);
		
		System.out.println("Element at position " + n + " is " + arr.get(n));
		
		

	}

}
