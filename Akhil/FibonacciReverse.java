package training10;

import java.util.Scanner;

public class FibonacciReverse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] arr = new int[n];
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<n; i++) {
			
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		
		for(int i=n-1; i>=0; i--) {
			
			System.out.print(arr[i] + ", ");
		}

	}

}
