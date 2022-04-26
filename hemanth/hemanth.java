Package practice;

import java.util.Scanner;

public class GuessTheWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		String res = "";

		for (int i = 0; i < n; i++) {
			str[i] = scan.next();
			if (str[i].length()%2!=0 && str[i].length()>res.length()) 
                        {
				res = str[i];
			}
		}

		if (res.length()%2!=0) {
			System.out.println(res);
		} else {
			System.out.println("Better luck next time");
		}
	}

}



sample input1:
2
hemanth babu

sample output1:
hemanth


sample input2:
5
hello good morning welcome you

sample output2:
morning



sample input3:
2
indian government

sample output3:
better luck next time