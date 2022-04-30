package com.problem.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StringIntegerProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of test cases: ");
		int n = sc.nextInt();
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=0; i<n; i++) {
			int c = sc.nextInt();
			if(c == 1) {
				String s = sc.next();
				arr.add("String");
				arr.add(s);
				
			} else if(c == 2) {
				int v = sc.nextInt();
				arr.add("Integer");
				arr.add(String.valueOf(v));
			}
		}
		
		Iterator<String> itr=arr.iterator();
		
		
		while(itr.hasNext()) {
			
			System.out.println(itr);
		}

	}

}
