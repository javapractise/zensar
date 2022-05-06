package com.java.problem.string;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StringList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("Shivam");
		list.add("Raju");
		list.add("raj");
		list.add("aanchal");
		list.add("arpit");

		long i = list.stream().count();
	
	System.out.println(i);

	}

}
