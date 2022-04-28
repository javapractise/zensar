
import java.util.Scanner;

public class id {
	public static void main(String[] args)
	{
		String a;
		String s="";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		a=sc.nextLine();
		int l=a.length();
		for(int i=0;i<l-1;i++)
		{
			for(int j=i;j<l;j++)
			{
				s=a.substring(i,j+1);			
			}
		}
		System.out.println("the last student is :"+s);
		
	}

}
