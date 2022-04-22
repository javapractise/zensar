//Remove white Spaces

import java.util.*;
class Remove{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		char[] arr2 = new char[str.length()];
		System.out.println("Given String : "+str);
		int j=0;
		for(int i=0 ; i< arr.length; i++)
		{
			if(arr[i] != ' ')
			{
				arr2[j] = arr[i];
				j++;
			}
		}
		 str = String.valueOf(arr2);
		System.out.println("Updated String : "+str);
	}
}