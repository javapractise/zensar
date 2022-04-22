package stirngpractice;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		String s3 = Arrays.toString(a);
		String s4 = Arrays.toString(b);
		if(s3.compareTo(s4)==0) {
			System.out.println("Given Strings are Anagram");
		}
		else {
			System.out.println("Given Strings are not Anagram");
		}
	}

}
