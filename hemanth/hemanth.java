package javapractice;

import java.util.Scanner;

public class stringreverse {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			count++;
			i++;
		}
		System.out.println("count is :"+count);
		
	}
	
		
}
