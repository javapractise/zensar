public class Duplicate {

	public static void main(String[] args) {
		
		String str="Archana Reddy";
		char[] c = str.toCharArray();
		System.out.println("the string is:" + str);
		System.out.println("duplicate characters in above string are:");
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j<str.length(); j++) {
				if (c[i] == c[j]) {
					System.out.print(c[j] + " ");
					break;
				}
			}
		}
	}

}
