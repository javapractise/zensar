package codingassignment;

import java.util.Scanner;

public class GuessTheWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] word = new String[n];
		String check = "";

		for (int i = 0; i < n; i++) {
			word[i] = scan.next();
			if (word[i].length() % 2 != 0 && word[i].length() > check.length()) {
				check = word[i];
			}
		}

		if (check.length() % 2 != 0) {
			System.out.println(check);
		} else {
			System.out.println("Better luck next time");
		}
	}

}
