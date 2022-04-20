

import java.util.Scanner;

public class nine {
	public static void main(String[]args)
	{
		int avg=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of inputs: ");
		int n=sc.nextInt();
		int[] a =new int[n];
		for(int i =0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++)
		{
			avg=avg+a[j];
		}
		System.out.println("the average is: "+ avg);
	}

}
