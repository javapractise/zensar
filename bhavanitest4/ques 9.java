import java.util.*;
class Average
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[] =new int[10];
int sum=0,avg;
for(int i=1;i<=10;i++)
{
arr[i]=sc.nextInt();
}
for(int j=1;j<=10;j++)
{
sum+=arr[j];
}
avg=sum/10;
System.out.println("avg of 10 numbers"+avg);
}
}