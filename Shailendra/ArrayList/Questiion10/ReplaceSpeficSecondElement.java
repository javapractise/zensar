package com.java.collection.Questiion10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReplaceSpeficSecondElement {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Raju");
		list.add("Govind");
		list.add("Sinu");
		list.add("Raju");
		list.add("Govind");
		list.add("Pooja");
		System.out.println(list);
		System.out.println();
		System.out.println("after replace second element");
		list.set(1, "Allu");
		System.out.println(list);

	}

}
