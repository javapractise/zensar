package com.java.java8feature;

import java.util.function.Predicate;

public class OddEvenPreditct {
	static boolean even(int n) {
		if (n % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Predicate<Integer> predicate = OddEvenPreditct::even;
		boolean result = predicate.test(8);
		System.out.println(result);
	}

}
