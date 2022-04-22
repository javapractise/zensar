// Swap

import java.util.*;
class Swap{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println("Given Strings :");
		System.out.println("First String \t: "+str1);
		System.out.println("Second String \t: "+str2);
		str1 = str1 + str2;
		str2 = str1.substring(0,str1.length()- str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("Swapped Strings :");
		System.out.println("First String \t: "+str1);
		System.out.println("Second String \t: "+str2);
		
	}
}