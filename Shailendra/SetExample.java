package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
	Set<String > cites =new HashSet<String>();
      //Insertion order not maintain duplicate also not allowed 
	//sorted
	cites.add("Indore");
	cites.add("Pune");
	cites.add("Mumbai");
	cites.add("Chennai");
	cites.add("Indore");
	
	Iterator<String> itr =cites.iterator();
	// Iterator has only going forward direction (hasNext())
	while(itr.hasNext())
	{
		String citess =itr.next();
		System.out.println(citess);
	}
	
	//listitrator
	itr.
			
	}

}
