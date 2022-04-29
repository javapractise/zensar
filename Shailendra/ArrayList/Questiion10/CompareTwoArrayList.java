package com.java.collection.Questiion10;

import java.util.ArrayList;
import java.util.ListIterator;

public class CompareTwoArrayList {

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
		
		ArrayList<String> list2 = new ArrayList<>();

		list2.add("Raju");
		list2.add("Shailendra");
		list2.add("Sinu");
		list2.add("Raju");
		list2.add("Samta");
		list2.add("Pooja");

		ListIterator<String> listItr1 = list2.listIterator();
		while (listItr1.hasNext()) {
			System.out.println(listItr1.next());

		}
		System.out.println();
		System.out.println("Compare");
		System.out.println(list.equals(list2));

	}

}
