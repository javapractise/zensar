package com.java.practice;

public class CopyArray {
	public static void main(String[] args) {
		 int a[] = { 1, 8, 3 };
		 
	      
	        int b[] =a;
		for (int i = 0; i < a.length; i++)
            b[i] = a[i];
 
	
		
		   System.out.println("Contents of a[] ");
		   
	        for (int i = 0; i < a.length; i++)
	            System.out.print(a[i] + " ");
	 
	        // Display message only
	        System.out.println("\n\nContents of b[] ");
	 
	        for (int i = 0; i < b.length; i++)
	            System.out.print(b[i] + " ");
		
	}

}
