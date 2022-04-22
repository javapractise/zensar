package com.java.stringpractice;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
	String s1 ="sinu";
	String s2 ="unis";
	if(s1.length() ==s2.length())
	{
		char stringS1[] =s1.toCharArray();
		char stringS2[] =s2.toCharArray();
		Arrays.sort(stringS1);
		Arrays.sort(stringS2);
		
		boolean result =Arrays.equals(stringS1, stringS2);
		if(result)
		{
			System.out.println(s1 +"and "+s2+"Are Equal");
		}
		else
		{
			System.out.println(s1 +"and "+s2+"Are Not Equal");
			
			
		}
		
	}
	else
	{

		System.out.println(s1 +"and "+s2+"are not Equal");
	
	}
	
	
				
	}

}
