import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		String result = "";

		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
			if (arr[i].length() % 2 != 0 && arr[i].length() > result.length()) {
				result = arr[i];
			}
		}

		if (result.length() % 2 != 0) {
			System.out.println(result);
		} else {
			System.out.println("Better luck next time");
		}
	}

	}

