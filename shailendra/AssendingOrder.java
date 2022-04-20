package com.java.practice;

public class AssendingOrder {

	public static void main(String[] args) {

		// Initialize array
		int[] arr = { 4, 5, 62, 1, 2, 7, 6, 9 };
		int temprory = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temprory = arr[i];
					arr[i] = arr[j];
					arr[j] = temprory;
				}
			}
		}

		System.out.println();

	
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
