package practice2;
import java.util.*;

public class Nine {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	int sum=0,average;
	System.out.println("Enter the Numbers");
	for(int i=1;i<=10;i++)
	{
	arr[i]=sc.nextInt();
	}
	for(int j=1;j<=10;j++)
	{
	sum+=arr[j];
	}
	average=sum/10;
	System.out.println("Average of  numbers:" + average);
	}

}
