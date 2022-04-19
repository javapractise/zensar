package com.zensar.java;

import java.util.Scanner;

public class DuplicateElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("Enter the elements into an array: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("The duplicate elements are: ");
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && i!=j)
					System.out.println(a[j]);
			}
		}
	}

}
