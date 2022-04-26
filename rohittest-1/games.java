
import java.util.Scanner;

public class games {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.println("Enter the number of strings for input:");
		n=sc.nextInt();
		String [] s=new String[n];
		String s1="";
		sc.nextLine();
		// to take input from user
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.nextLine();
		}
		//to check the length of the string is odd or even 
		
		for (int i=0;i<s.length;i++) {
			if (s[i].length()%2!= 0)
			{
				if(s[i].length()>s1.length())
				{
					s1 = s[i];
				}
			}
		}
		if (s1.length()%2!=0)
		{
			System.out.println(s1);
		} 
		else 
		{
			System.out.println("Better luck next time");
		}
	}
}

out-put:
Enter the number of strings for input:
5
hello
good
morning
welcome
you
morning
