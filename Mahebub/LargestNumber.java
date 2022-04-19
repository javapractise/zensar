package com.zensar.java;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[6];
		int temp = 0;
		for(int i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		System.out.println(temp);
	}
}
