// Replace space to given character

import java.util.*;
class Replace{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		System.out.println("Enter character to put inplace of space : ");
		char c = sc.next().charAt(0);
		char[] arr = str.toCharArray();
		System.out.println("Given String : "+str);
		for(int i=0 ; i< arr.length; i++)
		{
			if(arr[i] == ' ')
			{
				arr[i] = c;
			}
		}
		 str = String.valueOf(arr);
		System.out.println("Updated String : "+str);
	}
}