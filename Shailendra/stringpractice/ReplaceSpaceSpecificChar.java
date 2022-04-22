package com.java.stringpractice;

public class ReplaceSpaceSpecificChar {
public static void main(String[] args) {
	String s ="Hey this is Me";
	char ch ='-';
	System.out.println("String is  : "+s);
	s =s.replace(' ', ch);
	System.out.println(s);
}
}
