import java.util.Arrays;
import java.util.Scanner;

public class Toys {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n,i=0,j=0;
		int sum=0,count=0;
		int amount,toys=0;
		System.out.println("Enter the no of elements:");
		n=sc.nextInt();
		int []arr= new int[n];
		while(i<arr.length)
		{
			arr[i]=sc.nextInt();
			i++;
		}
		Arrays.sort(arr);
		System.out.println("Enter the amount u have to by toys:");
		amount=sc.nextInt();
		while(j<arr.length)
		{
			if(sum<amount)
			{
				sum=sum+arr[j];
				count=count+1;
			}
			j++;
		}
		toys=count-1;
		System.out.println("the total number of toys they can buy eith the amount are:"+toys);
		
	}
}