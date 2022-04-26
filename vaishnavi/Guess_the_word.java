package project1;
import java.util.Scanner;

public class Guess_the_word {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] str = new String[n];
		String res = "";

		for (int i = 0; i < n; i++) {
			str[i] = scan.next();
			if (str[i].length() % 2 != 0 && str[i].length() > res.length()) {
				res = str[i];
			}
		}

		if (res.length() % 2 != 0) {
			System.out.println(res);
		} else {
			System.out.println("Better luck next time");
		}
	}

}