package com.zensar.java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to check whether it is palindrome or not: ");
		String s = scan.next();
		String reverse="";
		for(int i=s.length()-1;i>=0;--i) {
			reverse = reverse+s.charAt(i);
		}
		if(s.equals(reverse)) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The string is not palindrome");
		}
	}

}
