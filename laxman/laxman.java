import java.util.Arrays;
import java.util.Scanner;

public class toysbuy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int toys=sc.nextInt();
		int[] arr=new int[toys];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int cash=sc.nextInt();
		System.out.print(nooftoys(arr,toys,cash));
		
		

	}
	static int nooftoys(int arr[],int toys,int cash) {
		int sum=0;
		int count=0;
		Arrays.sort(arr);
		
			for(int i=0;i<arr.length;i++)
			{
			if(sum+arr[i]<=cash)
			{
				sum=sum+arr[i];
				count++;
			}
		}
		return count;
	}

}
