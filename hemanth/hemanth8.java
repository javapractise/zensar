package javapractice;

import java.util.Scanner;

public class stringreverse {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		String str =sc.next();
		String str1=str.substring(5);
		System.out.println(str1);
		str1=str.substring(2, 5);
		System.out.println(str1);

	}
		
	}