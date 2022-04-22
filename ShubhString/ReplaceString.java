// ReplaceString in Java

import java.util.*;
import java.util.lang; 
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ReplaceString {

	public static void main(String[] args) {
		
		String str = "This is java microservies batch";
		char ch = '-';
		
		str = str.replace(' ', ch);
		
		System.out.println(str);

	}

}  