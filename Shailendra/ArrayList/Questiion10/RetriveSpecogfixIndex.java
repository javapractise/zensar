package com.java.collection.Questiion10;

import java.util.ArrayList;
import java.util.Scanner;

public class RetriveSpecogfixIndex {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Raju");
		list.add("Govind");
		list.add("Sinu");
		list.add("Raju");
		list.add("Govind");
		list.add("Pooja");

		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 0 to 5 fo specific retrived");
		int i=sc.nextInt();
		System.out.println(list.get(i));

		

	}

}
