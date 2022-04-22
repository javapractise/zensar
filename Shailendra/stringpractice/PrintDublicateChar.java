package com.java.stringpractice;

public class PrintDublicateChar {

	public static void main(String[] args) {
		String s ="Apple is keep away from docter ";
	
		char[] ch =s.toCharArray();
		System.out.println("String is"+s);
		System.out.println("duplicate Char is:");
		for(int i =0;i<ch.length;i++)
		{
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j])
				{System.out.print(ch[j]+" ");
				break;
				}
			}
			
		}
	}
}


