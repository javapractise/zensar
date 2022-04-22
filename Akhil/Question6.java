package training6;

import java.util.Scanner;
import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first word: ");
		String first_word = input.nextLine();
		
		System.out.println("Enter second word: ");
		String second_word = input.nextLine();
		
		
		if(first_word.length() != second_word.length()) {
			System.out.println("Two strings are not anagram");
		} else {
			
			boolean check = true;
			
			char[] first_arr = first_word.toCharArray();
			char[] second_arr = second_word.toCharArray();
			
			Arrays.sort(first_arr);
			Arrays.sort(second_arr);
			
			for(int i=0; i<first_arr.length; i++) {
				if(first_arr[i] != second_arr[i]) {
					check = false;
					break;
				} 
			}
			
			if(check == false) {
				System.out.println("Two strings are not anagram");
			} else {
				System.out.println("Two strings are anagram");
			}
		}
		

	}

}
