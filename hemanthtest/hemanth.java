package test;

import java.util.Arrays;
import java.util.Scanner;

public class toysbuy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nooftoys=sc.nextInt();
		int[] arr=new int[nooftoys];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int amount=sc.nextInt();
		System.out.print(nooftoys(arr,nooftoys,amount));
		
		

	}
	static int nooftoys(int arr[],int nooftoys,int money) {
		int sum=0;
		int count=0;
		Arrays.sort(arr);
		
			for(int i=0;i<arr.length;i++)
			{
			if(sum+arr[i]<=money)
			{
				sum=sum+arr[i];
				count++;
			}
		}
		return count;
	}

}
------------
sample input1:
7
1
4
5
3
2
1
6
6

sample output1:
3

-------------------------
sample input2:
10
1
12
5
111
200
1000
10
9
12
15
50
sample output2:
6