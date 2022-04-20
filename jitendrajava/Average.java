import java.util.*;
class Average{
public static void main(String[] main)
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
int sum=0,average;
System.out.println("enter 10 integers");
for(int i=1;i<=10;i++)
{
arr[i]=sc.nextInt();
}
for(int j=1;j<=10;j++)
{
sum+=arr[j];
}
average=sum/10;
System.out.println("Average of 10 numbers:" + average);
}
}
