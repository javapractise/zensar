package com.java.collection.Questiion10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class SuffleElement {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Raju");
		list.add("Govind");
		list.add("Sinu");
		list.add("Raju");
		list.add("Govind");
		list.add("Pooja");

		Collections.shuffle(list);
		ListIterator<String> listItr =list.listIterator();
		while(listItr.hasNext())
		{
			System.out.println( listItr.next());
			


	}

}
}
