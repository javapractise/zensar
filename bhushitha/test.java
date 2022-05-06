package ExceptionHandling;
import java.util.*;
import java.util.Arrays;

public class MaxToys {

	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {

		int nooftoys=sc.nextInt();
		int[] arr=new int[nooftoys];
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=sc.nextInt();
		}
		int amount =sc.nextInt();
		System.out.print(maxtoys(arr,nooftoys,amount));
	} }
	static int maxtoys(int arr[],int maxtoys,int money) {
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

//output::
7
1
4
5
3
2
1
6
6



3