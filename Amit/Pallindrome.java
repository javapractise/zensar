// Pallindrome 

import java.util.*;

class Pallindrome{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		String str1 = new String();
		str1 = sc.nextLine();
		String str = str1.toLowerCase();
		String rev = new String();
		rev = "";
		for(int i=0 ; i<str.length();i++)
		{
			rev = str.charAt(i)+rev;
		}
		
		if(str.equals(rev))
		{
			System.out.println(str1+" is Pallindrome");
		}
		else
		{
			System.out.println(str1+" is NOT Pallindrome");
		}
	}
}