package com.java.java8feature.stream;

import java.util.Arrays;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 11, 23, 45, 67, 2, 3, 42, 2, 8, 9, 565, 354, 34, 57, 3);
		list.stream().map(e->e+"").filter(e->e.startsWith("1")).forEach(System.out::println);
	}

}
