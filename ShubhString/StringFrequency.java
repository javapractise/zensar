// StringFrequency in Java

import java.util.*;
import java.util.lang; 
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class StringFrequency {

	public static void main(String[] args) {
		
		String str = "Shubham Mahale";
		char ch = 'i';
		int frequency = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				frequency++;
			}
		}
		
		System.out.println("Frequency of " + ch + " in string is " + frequency);

	}

} 