import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		String result = "";

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			if (s[i].length() % 2 != 0 && s[i].length() > result.length()) {
				result = s[i];
			}
		}

		if (result.length() % 2 != 0) {
			System.out.println(result);
		} else {
			System.out.println("Better luck next time");
		}
	}

}