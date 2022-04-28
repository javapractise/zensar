package training11;

import java.util.Scanner;

public class LastStudentId {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int len = s.length() - 2;
		
		
		for(int i=len; i<s.length(); i++) {
			
			System.out.print(s.charAt(i));
		}

	}

}
