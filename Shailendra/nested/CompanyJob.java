import java.util.Scanner;
class CompanyJob
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();//                 First line contains Integers
int num=3*n;
int arr[]=new int[num]; //           now we insert 3*n variables

for(int i=0;i<=arr.length-1;i++)
{
arr[i]=sc.nextInt();
}
int greatest=0;
int total=0;
int x=0;
for(int i=2;i<=arr.length-1;i=i+3)
{
if(greatest<arr[i])
{
greatest=arr[i];
//x++;
}
if(greatest==arr[i])
{
x++;
}
total=total+arr[i];
}
total=total-greatest;
int arr1[]=new int[2];
if(x==n)
{
arr1[0]=0;
arr1[1]=0;
}
else
{
arr1[0]=n-1;
arr1[1]=total;
}
System.out.println(arr1[0]+"   "+arr1[1]);
}}



