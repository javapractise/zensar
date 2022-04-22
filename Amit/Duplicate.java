// Duplicate characters from strings

import java.util.Scanner;

class Duplicate{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = new String();
		str = sc.next();
		System.out.println("Given String : "+str);
		System.out.println("Duplicate characters from the string : ");
		for(int i=0 ; i<str.length(); i++)
		{
			for(int j=i+1 ; j<str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					System.out.println(" '"+str.charAt(j)+"'");
				}
			}
		}
	}
}