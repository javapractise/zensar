package com.java.java8feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamLembda {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
	List<Integer> newList =	list.stream().filter(e ->e%2 == 0).collect(Collectors.toList());
		System.out.println(newList);
	List<Integer> squre =	list.stream().map(e-> e*e).collect(Collectors.toList());
	System.out.println(squre);
	}

}
