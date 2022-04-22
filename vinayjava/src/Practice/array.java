package Practice;

import java.util.Scanner;

public class array {
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter array Length:");
			int length = sc.nextInt();
			int[] arr1 = new int[length];
			System.out.println("enter the numbers:");
			for(int i = 0 ; i < length ; i++){
				arr1[i] = sc.nextInt();
			}
			int[] arr2 = new int[length];
			for(int j=0; j< length ; j++){
				arr2[j] = arr1[j];
			}
			System.out.println("First Array elements:\n");
			for(int i=0 ; i<length ; i++){
				System.out.print(arr1[i]+"\t");	
			}
			System.out.println("\nSecond Array elements:\n");
			for(int i=0 ; i<length ; i++){
				System.out.print(arr2[i] +"\t");

	}

}
}