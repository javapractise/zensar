
import java.util.Scanner;

public class equal {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String s;
		System.out.println("Enter string to divide:");
		s=sc.nextLine();
		int p;
		p=s.length()/5;
		
			for(int i=0; i<s.length(); i++)
			{
				if(i % p == 0)
				{
					System.out.println();
				}
				else
				{
				System.out.println(s.charAt(i));
				}
			}
	}
}