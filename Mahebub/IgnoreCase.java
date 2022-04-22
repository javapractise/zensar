package stirngpractice;

import java.util.Scanner;

public class IgnoreCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.compareToIgnoreCase(b));
	}
}
