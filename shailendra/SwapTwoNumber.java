package com.java.practice;

public class SwapTwoNumber {

	public static void main(String[] ars) {
		int a = 5;
		int b = 10;
		int temp = 0;
		System.out.println("before swaping value of a=:" + a);
		System.out.println("before swaping value of b=:" + b);

		temp = a;
		a = b;
		b = temp;
		System.out.println("after swaping value of a=:" + a);
		System.out.println("after swaping value of b=:" + b);

	}

}
