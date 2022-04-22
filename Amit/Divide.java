// Make 5 group

import java.util.*;
class Divide{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count=0;
		for(int i=0;  i<str.length();i++)
		{
			if(count ==5)
			{
				System.out.print(" ");
				count=0;
			}
			System.out.print(str.charAt(i));
			count++;
		}
	}
}