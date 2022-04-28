package codingassignment;

import java.util.Scanner;

public class StudentId {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String a = "";
		String last = "0";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				a = s.substring(i,j+1);
				if(last.charAt(0)<=a.charAt(0)) {
					last = a;
				}
			}
		}
		System.out.println("The last student ID is: "+last);
	}

}
