
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		String s1;
		System.out.println("Enter string 1:");
		s1=sc.nextLine();
		String s2= "";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		boolean s3=s1.equalsIgnoreCase(s2);
		if(s3==true)
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	}
}

