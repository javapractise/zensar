package javaprogram;

public class ReplaceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Work hard success will come";
		char ch ='-';
		System.out.println("string before replacing space");
		System.out.println(string);
		string = string.replace(' ', ch);
		System.out.println("string after replacing space");
		
		System.out.println(string);
	}

}
