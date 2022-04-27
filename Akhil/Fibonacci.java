package training10;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int firstTerm = 0, secondTerm = 1;
		
		for(int i=0; i<n; i++) {
			System.out.print(firstTerm + ", ");
			
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}

	}

}
