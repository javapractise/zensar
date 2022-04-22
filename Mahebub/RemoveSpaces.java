package stirngpractice;

public class RemoveSpaces {

	public static void main(String[] args) {
		String s = "Java Programing ";
		String s1 = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				s1 = s.replaceAll(" ", "");
			}
		}
		System.out.println(s1);
	}

}
