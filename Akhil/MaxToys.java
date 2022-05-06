package training15;

import java.util.Arrays;
import java.util.Scanner;

public class MaxToys {

	static int getMaxToys(int[] arr, int money) {
		
		int count = 0;

		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] <= money) {
				count++;
				money -= arr[i];
			}
		}


		return count;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = input.nextInt();
		
		System.out.println("Enter money");
		int money = input.nextInt();

		int[] prices = new int[n];

		System.out.println("Enter elements into array");

		for(int i=0; i<n; i++) {
			prices[i] = input.nextInt();
		}
		
		input.close();

		System.out.println(getMaxToys(prices, money));

	}

}
