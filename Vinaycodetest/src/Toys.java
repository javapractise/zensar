import java.util.Scanner;
public class Toys {
	public static int getMaxToys(int prices[],int money)
	{
	int sum=0;
	int count=0;
	int maximum=0;
	for(int start=0;start<prices.length;start++){
	sum=count=0;
	for(int j=start;j<prices.length;j++) {
	if((sum+prices[j])<=money)
	{
	sum=sum+prices[j];
	count=count+1;
	maximum=Math.max(count,maximum);
	}
	else
	{
	count=0;
	sum=0;
	break;
	}
	}
	}
	return maximum;
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int prices[]=new int[n];
	for(int i=0;i<n;i++)
	prices[i]=sc.nextInt();
	int money=sc.nextInt();
	System.out.println(getMaxToys(prices,money));
	}
	}
	SAMPLE INPUT:
		7
		4
		1
		5
		3
		2
		1
		6
		6
	OUTPUT:
		3

}
