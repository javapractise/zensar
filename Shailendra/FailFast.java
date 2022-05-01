package com.java.collection;

import java.util.ArrayList;
import java.util.Comparator;

public class FailFast {

	public static void main(String[] args) {
		ArrayList<String > list =new ArrayList<>();
		list.add("Sinu");
		list.add("Raju");
		list.add("Govind");
		
		//Iterator<String>  itr =list.iterator();
		for(String s :list)
		{
			System.out.println(s);
		list.add("addd other");
			
		}
		
	}

}
