public class CharacterString {

	public static void main(String[] args) {

		String str = "This is Subbarao";
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