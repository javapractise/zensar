package com.java.practice;

public class FindTheLargest {
	public static void main(String[] args) {
		
	
	int a[]= {3,4,5,63,2,45};
	int largest = a[0];
	for (int i = 0; i < a.length; i++)
	{
		for (i = 1; i < a.length; i++)
            if (a[i] > largest)
                largest = a[i];
		
	}
	System.out.println("Largest number"+largest);
	}
}
