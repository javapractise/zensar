package codingassignment;

import java.util.Scanner;

public class StudentId {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String a = "";
		String name[] = new String[s.length()];

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				a = s.substring(i, j + 1);
				name[i] = a;
			}
		}

		for (int i = 0; i < name.length - 1; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].compareTo(name[j]) > 0) {
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}

		System.out.println("The last student ID is: " + name[name.length - 1]);
	}

}
