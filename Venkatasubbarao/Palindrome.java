package training;

public class Palindrome {

	public static void main(String[] args) {

		String str = "abba";
		String rev_str = "";

		for(int i=str.length()-1; i>=0; i--) {
			rev_str += str.charAt(i);
		}

		if(str.equals(rev_str)) {
			System.out.println("Given string is a palindrome.");
		} 
		else {
			System.out.println("Given string is not a palindrome.");
		}

	}

}