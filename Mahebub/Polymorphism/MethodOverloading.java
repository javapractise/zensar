package com.zensar.polymorphism;

public class MethodOverloading {
	public int multiply(int a, int b) {
		int result = a*b;
		return result;
	}
	
	public double multiply(int a, double b) {
		double result = a*b;
		return result;
	}
}

class Test1 {
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		System.out.println(mo.multiply(7, 4));
		System.out.println(mo.multiply(6, 8.4));
	}
}
