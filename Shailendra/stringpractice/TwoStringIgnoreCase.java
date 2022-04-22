package com.java.stringpractice;

public class TwoStringIgnoreCase {

	public static void main(String[] args) {
	String s ="sinu";
	String s1 ="SINU";
	System.out.println(s1.equalsIgnoreCase(s));
	String string1 ="Raju";
	System.out.println(string1.compareToIgnoreCase(s1));
	System.out.println(s1.compareToIgnoreCase(s));
	
	}

}
