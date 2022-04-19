package training;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		int[] arr = {2, 4, 1, 3, 5};
		
		System.out.println("Original Array:");
		for(int num: arr) {
			System.out.print(num + " ");
		}

		Arrays.sort(arr);
		System.out.println();
		
		System.out.println("Sorted Array:");
		for(int num: arr) {
			System.out.print(num + " ");
		}

	}

}
