
import java.util.Scanner;

public class removespc {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String s;
		System.out.println("Enter the string with spaces:");
		s=sc.nextLine();
		char[] cs = s.toCharArray(); 
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<cs.length;i++)
		{
			if(cs[i]!=' ')
			{
				sb=sb.append(cs[i]);
			}
		}
		System.out.println("String after removing all the spaces is:"+sb);
		
	}

}
