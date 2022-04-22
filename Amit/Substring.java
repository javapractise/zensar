// Subset of aString

import java.util.*;
class Substring{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.nextLine();
		System.out.println("Enter the starting point for substring: ");
		int start = sc.nextInt();
		System.out.println("Enter the end point for substring: ");
		int end = sc.nextInt();
		char[] sub = new char[str.length()];
		if(start<0 && start>str.length() && end<0 && end > str.length())
		{
			System.out.println("Invalid input");
		}
		else
		{
			int j=0,k=0;
			for( k=start; k<=end; k++)
			{
				System.out.print( str.charAt(k));
			}
		}
		//String res = sub.toString();
		//System.out.println(res);
	}
}