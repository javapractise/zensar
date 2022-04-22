package com.java.practice;


public class DuplicateArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2,2, 3, 4, 5, 6, 5, 4, 3, 8, 9 };
		   System.out.println("Duplicate elements in given array: ");  
		   
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j]+ "");

				}

			}

		}

	}

}
