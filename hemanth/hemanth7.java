package javapractice;

import java.util.Scanner;

public class stringreverse {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		String str =sc.next();
		String str1=str.replaceAll("\\s","");
		System.out.println(str1);

	}
		
	}