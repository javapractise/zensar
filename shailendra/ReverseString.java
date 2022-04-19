//ShailendraGoad
package com.java.practice;

public class ReverseString {
	public static void main(String[] args) {
		String string = "shailendra";
		char stringArray[] = string.toCharArray();
		String revese = "";
		for (int i = stringArray.length - 1; i >= 0; i--) {
			revese += stringArray[i];
		}
		System.out.println("Reverse String-: " + revese);
	}

}
