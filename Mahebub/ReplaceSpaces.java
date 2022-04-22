package stirngpractice;

public class ReplaceSpaces {

	public static void main(String[] args) {
		String s = "Java Programming ";
		String s1 = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				s1 = s.replace(' ', 's');
			}
		}
		System.out.println(s1);
	}

}
