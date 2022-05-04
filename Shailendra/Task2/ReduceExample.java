package com.java.java8feature;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		int sum = list.stream().reduce(0, (a, b) -> a + b);

		System.out.println(sum);

	}

}
