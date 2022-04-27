package training;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Akhil";
		String rev_str = "";

		for(int i=str.length()-1; i>=0; i--) {
			rev_str += str.charAt(i);
		}

		System.out.println("Reverse of "+ str + " is " + rev_str);

	}

}