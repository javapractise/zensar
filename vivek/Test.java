import java.util.*;
public class TestOne
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String arr[]=new String[n];
for(int i=0;i<n;i++)
arr[i]=sc.next();
int len=0;
ArrayList<String> testOne=new ArrayList<String>();
for(int i=0;i<n;i++)
{
len=arr[i].length();
if(len%2==1)
testOne.add(arr[i]);
}
if(testOne.size()==0)
System.out.println("better luck next time");
else
{
Iterator itr=testOne.iterator();
int max=-1;
String res="";
while(itr.hasNext())
{
String temp=(String)itr.next();
if(temp.length()>max)
{
res=temp;
max=temp.length();
}
}
System.out.println(res);
}
}
}