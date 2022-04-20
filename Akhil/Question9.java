package training2;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		
		
		for(int i=0; i<10; i++) {
			System.out.print("Enter number " + (i+1) + " : ");
			sum += s.nextInt();
		}
		
		System.out.println("Average :" + sum/10);
		
		

	}

}
