package stirngpractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String reverse = "";
		for(int i=s.length()-1;i>=0;--i) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
	}

}
