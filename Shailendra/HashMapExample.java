package com.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
HashMap<String, String> employees =new HashMap<>();
employees.put("Shailendra", "s@mail.com") ;
employees.put("Raju", "r@mail.com") ;
employees.put("Mahesh", "m@mail.com") ;
employees.put("Yash", "y@mail.com") ;


for(Map.Entry<String, String> entry :employees.entrySet())
{
	System.out.println("Name "+entry.getKey()+" "+	
			"Email"+entry.getValue());
	
}


	}

}
