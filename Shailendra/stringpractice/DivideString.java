package com.java.stringpractice;

public class DivideString {

	public static void main(String[] args) {
	String string ="shailendra";
	if(string.length() %5 != 0)
	{
		System.out.println("Not Divisible by 5");
	}
	
	int part =string.length()/5;
	
	for (int i = 0; i< string.length(); i++) 
    { 
        if(i % part== 0) 
        System.out.println();  
        System.out.print(string.charAt(i)); 
    } 
	
	

	}

}
