

import java.util.Scanner;

public class ignorecase1 {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String s;
		System.out.println("Enter string 1:");
		s=sc.nextLine();
		String s1;
		System.out.println("Enter string 2:");
		s1=sc.nextLine();
		
		boolean e1= s.equalsIgnoreCase(s1);
		
		
			System.out.println("Both strings are equal:"+e1);
	}

}
