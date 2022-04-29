package training11;

import java.util.ArrayList;
import java.util.Scanner;

public class StringInteger {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of test cases: ");
		int n = input.nextInt();
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=0; i<n; i++) {
			int c = input.nextInt();
			if(c == 1) {
				String s = input.next();
				arr.add("String");
				arr.add(s);
				
			} else if(c == 2) {
				int v = input.nextInt();
				arr.add("Integer");
				arr.add(String.valueOf(v));
			}
		}
		
		for(String ele: arr) {
			
			System.out.println(ele);
		}

	}

}
