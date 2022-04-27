
package training6;

public class Question8 {

	public static void main(String[] args) {

		String str = "This is java microservies batch";
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