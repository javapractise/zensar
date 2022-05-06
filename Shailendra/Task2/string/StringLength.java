package com.java.problem.string;

import java.util.ArrayList;

public class StringLength {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("Shivam");
		list.add("Raju");
		list.add("raj");
		list.add("aanchal");
		list.add("arpit");
		long n = list.stream().filter(e ->e.length() > 3).count();
		System.out.println(n);
	}
}
