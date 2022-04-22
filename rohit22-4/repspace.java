
import java.util.Scanner;

public class repspace {
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String s;
		System.out.println("Enter the string with a space");
		s=sc.nextLine();
		
		//input from user
		
		String s1;
		System.out.println("Enter the character to replace");
		s1=sc.nextLine();
		
		//used to replace the character in string
		
		s=s.replace(" ", s1);
		 System.out.println("String after replacing space is: "+s);    
		}
	}
