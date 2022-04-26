package training7;

import java.util.*;


public class Game {
	
	// sorting odd and maximum words
	public static String maxWord(String[] arr) {
		int maxLen = 0;
		String maxStr = "Better Luck Next Time..!";

		for(String word: arr) {
			if((word.length() % 2) != 0) {
				if(word.length() > maxLen) {
					maxLen = word.length();
					maxStr = word;
				}

			}
		}
		
		return maxStr;


	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// size of array
		int n = input.nextInt();
		
		String[] words = new String[n];
		
		// reading inputs
		for(int i=0; i<n; i++) {
			words[i] = input.next();
		}

		// calling method
		String result = maxWord(words);
		
		System.out.println(result);

	}


}
