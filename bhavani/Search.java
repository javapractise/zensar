import java.util.Scanner;
public class Search
{
public static void main(String args[])
{
int n,x,flag=0,i=0;
Scanner s=new Scanner(System.in);
System.out.print("enter number of elements");
n=s.nextInt();
int a[] = new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.print("enter number of elements you want to find");
x=s.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
 flag=1;
 break;
}
else
{
flag=0;
}
}
if(flag==1)
{
System.out.print("elements found at position"+(i+1));
}
else
{
System.out.print("elements not found");
}
}
}