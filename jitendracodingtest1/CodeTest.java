import java.util.*;
public class CodeTest
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String arr[]=new String[n];
for(int i=0;i<n;i++)
arr[i]=sc.next();
int len=0;
ArrayList<String> codeTest=new ArrayList<String>();
for(int i=0;i<n;i++)
{
len=arr[i].length();
if(len%2==1)
codeTest.add(arr[i]);
}
if(codeTest.size()==0)
System.out.println("Better luck next time");
else
{
Iterator itr=codeTest.iterator();
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
