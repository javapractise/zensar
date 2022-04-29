package com.java.collection.Questiion10;

import java.util.ArrayList;
import java.util.ListIterator;

public class CloneArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Raju");
		list.add("Govind");
		list.add("Sinu");
		list.add("Raju");
		list.add("Govind");
		list.add("Pooja");

		ListIterator<String> listItr = list.listIterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next());

		}
		System.out.println();

		ArrayList list2 = new ArrayList<>();

		list2 =(ArrayList<String>) list.clone();
		System.out.println(list2);
	

	}

}
