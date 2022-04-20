package com.zensar.inheritance;

import java.util.Scanner;

public class Square10 extends Square {

	public Square10(int length, int breadth) {
		super(length, breadth);
	}

	public void area() {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = length * length;
			System.out.println(a[i]+" ");
			length++;
		}
	}

}

class test3 {
	public static void main(String[] args) {
		Square10 s10 = new Square10(2, 20);
		s10.area();
	}
}
