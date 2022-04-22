package javapractice;

import java.util.Scanner;

public class stringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		if(str1.equals(str))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
