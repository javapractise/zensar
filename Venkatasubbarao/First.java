
import java.util.*;

public class First{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<String> strArray = new ArrayList<String>();
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		int[] arr = new int[num];
		int temp=0;
		for(int i=0 ; i < num ; i++ )
		{	
			temp = sc.nextInt();
			if(temp == 1)
			{	
				arr[i] = temp;
				String random = sc.next();
				strArray.add(random);
			}
			else if(temp == 2)
			{
				arr[i] = temp;
				int random = sc.nextInt();
				intArray.add(random);
			}
			else
			{
				System.out.println("Invalid value \nPlease 1 or 2");
			}
		}
		int strCount = 0 ; 
		int intCount = 0 ;
		System.out.println("\n");
		for(int i=0 ; i < num ; i++ )
		{
			if(arr[i] == 1)
			{	
				System.out.println("String");
				System.out.println(strArray.get(strCount));
				strCount++;
			}
			else if(arr[i] ==2)
			{	
				System.out.println("Integer");
				System.out.println(intArray.get(intCount));
				intCount++;
			}

		}
	}
}