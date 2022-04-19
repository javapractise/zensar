package com.zensar.java;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[6];
		int temp = 0;
		System.out.println("Enter the value into an array");
		for(int i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}
}
