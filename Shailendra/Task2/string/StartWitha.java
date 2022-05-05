package com.java.problem.string;

import java.util.ArrayList;

public class StartWitha {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("");
		list.add("Shivam");
		list.add("Raju");
		list.add("raj");
		list.add("aanchal");
		list.add("arpit");
		long i =list.stream().filter(e -> e.startsWith("a")).count();

		System.out.println(i);
	}
	

}
