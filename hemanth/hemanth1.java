//indexoutofboundsexception


package exceptions;

import java.util.Scanner;

public class arrayindex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		try {
		for(int i=0;i<6;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<6;i++)
		{
			System.out.println(arr[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}