import java.util.Scanner;
public class frequency {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String s;
		System.out.println("Enter the string:");
		s=sc.nextLine();
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count=count+1;
					System.out.println(s.charAt(j)+"-"+count);
				}
			}
		}
	}

}
