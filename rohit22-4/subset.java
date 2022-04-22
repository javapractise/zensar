import java.util.Scanner;

public class subset {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String s;
		System.out.println("Enter string to divide:");
		s=sc.nextLine();
		String s2;
		int temp = 0;  
		int l;
		l=s.length();
		String arr[] = new String[l*(l+1)/2]; 
		for(int i = 0; i < l; i++) {
			for(int j = i; j < l; j++) { 
				System.out.println(s.substring(i, j+1));
			}  
		}
		
	}
}