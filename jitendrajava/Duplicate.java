package javaprogram;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="jitendra jite";
		char[]carray = str.toCharArray();
		System.out.println("the string is:" + str);
		System.out.println("duplicate characters in above string are:");
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j<str.length(); j++) {
				if (carray[i] == carray[j]) {
					System.out.print(carray[j] + " ");
					break;
				}
			}
		}
	}

}
