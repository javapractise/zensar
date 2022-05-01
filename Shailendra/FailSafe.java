package com.java.collection;

import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<String>();
		names.add("prachi ");
		names.add("pooja ");
		names.add("divy ");
		names.add("prachi ");
		names.add("sakjsham ");
		
		Collections.sort(names);
		
		
		
	//<String>	it =names.iterator();
	
	
	for(String s : names)
	{
		
		names.add("Raju");
	System.out.println(s);

	}
	
	}
	
			
}
