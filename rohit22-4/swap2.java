

import java.util.Scanner;

public class swap2 {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String s;
		System.out.println("Enter string 1:");
		s=sc.nextLine();
		String s1;
		System.out.println("Enter string 2:");
		s1=sc.nextLine();
		
		System.out.println("Before swaping :");
		System.out.println(s);
		System.out.println(s1);
		
		
		String s2=s+s1;
		s1=s2.substring(0, s.length());
		s=s2.substring(s.length());
		
		System.out.println("After swaping :");
		System.out.println(s);
		System.out.println(s1);
	}

}
