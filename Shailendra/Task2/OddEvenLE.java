package com.java.java8feature;

@FunctionalInterface
interface oddEven {
	boolean evenOdd(int num);
}

public class OddEvenLE {

	public static void main(String[] args) {

		oddEven checkOddEven = (a) -> (a % 2 == 0);

		// (a -> a%2 ==0);

		System.out.println(checkOddEven.evenOdd(2));

	}

}
