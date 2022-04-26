package com.java.ExceptionHanding;

import java.util.Iterator;

public class ArrayIndexOutOfException {

	public static void main(String[] args) {
		int arr[] = {
		
		1,2,3,4,5};
		try
		{
		for (int i = -2; i < arr.length; i++) {
			int j = arr[i];
			
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		}
	
	
	
	
	}


