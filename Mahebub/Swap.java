package com.zensar.java;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers to swap: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("numbers before swapping: "+a+" and "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("numbers after swapping: "+a+" and "+b);
	}
}
