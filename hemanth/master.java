package javapractice;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int people=0;
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]==1)
				{
					people++;
				}
			}
		}
		System.out.println(people);

	}

}