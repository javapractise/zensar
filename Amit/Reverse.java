// Reverse

import java.util.*;

class Reverse{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		String str = new String();
		str = sc.nextLine();
		String rev = new String();
		rev = "";
		for(int i=0 ; i<str.length();i++)
		{
			rev = str.charAt(i)+rev;
		}
		System.out.println("Given String       \t: "+str);
		System.out.println("Reversed String \t: "+rev);
	}
}