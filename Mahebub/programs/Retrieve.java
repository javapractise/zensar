package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Retrieve {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(27);
		list.add(41);
		list.add(78);
		list.add(57);
		list.add(15);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter index to retrieve element: ");
		int n = scan.nextInt();
		System.out.println(list.get(n));
	}

}
