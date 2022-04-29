package com.java.collection.Questiion10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Raju");
		list.add("Govind");
		list.add("Sinu");
		list.add("Raju");
		list.add("Govind");
		list.add("Pooja");
		System.out.println("ArrayList");
		ListIterator<String> listItr1 = list.listIterator();
		while (listItr1.hasNext()) {
			System.out.println(listItr1.next());

		}
		System.out.println();
		Collections.reverse(list);

		System.out.println("ArrayList reverse");
		ListIterator<String> listItr = list.listIterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next());

		}

	}

}
