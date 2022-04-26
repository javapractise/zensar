package com.java.ExceptionHanding;

public class Aritmatic {

	public static void main(String[] args) {
		
int a=6;
int b =0;
int c ;

try {
	c =a/b;
	
}catch(ArithmeticException e)
{
	System.out.println("arthmatic Exception example");
	e.printStackTrace();
	
}

	}

}
