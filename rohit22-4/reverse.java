
import java.util.Scanner;
public class reverse {
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
		System.out.println("Reverse of String"+" "+s1+" "+"is"+" "+s2);
	}
}
