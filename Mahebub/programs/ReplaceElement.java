package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReplaceElement {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(27);
		list.add(41);
		list.add(78);
		list.add(57);
		list.add(15);
		
		System.out.println("Enter the number to replace: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Collections.replaceAll(list, 41, n);
		
		System.out.println(list);
	}
}
