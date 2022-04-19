package com.java.practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =989;
		int remainder ,sum = 0;
		int temp =number;
		while(number>0)
		{
			remainder=number%10;
			sum=(sum*10)+remainder;
			number =number/10;	
			
		}
		if(temp==sum)
		{
			System.out.println("Palindrome Number");
			
		}
		else
			System.out.println("Not Palindrome ");
	

	}

}
