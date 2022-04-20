package practice;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<10;i++)
		{
			int n=sc.nextInt();
			sum=sum+n;
		}
		System.out.print(sum/10);

	}

}
