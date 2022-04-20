package com.zensar.inheritance;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int sum = 0;
		for(int i=1;i<=10;i++) {
			n = scan.nextInt();
			sum = sum + n;
		}
		float average = (float) (sum/10);
		System.out.println(average);
	}

}
