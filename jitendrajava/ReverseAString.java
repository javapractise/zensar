//1. Reverse a string \\

public class ReverseAString{
  public static void main(String args[]){
String name="Jitendra";
int length=name.length();
String rev="";
for(int i=length-1; i>=0;i--)
{
rev=rev+name.charAt(i);
}
System.out.println("Reverse of "+name+" is "+rev);
}
}

** PalindromeNumber


public class PalindromeNumber
{
public static void main(String args[]) 
{
int no=121;
int temp=no;
int rev=0,rem;
while(temp!=0) 
{
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
if(no==rev)
{
System.out.println(no+" is palindrome number");
}
else
{
System.out.println(no+" is not a palindrome number");
}
}
}

--------------------------------------------------------------
** PrimeNumber

public class PrimeNumber
{
public static void main(String args[]) 
{
int no=7;
int temp=0;
for(int i=2;i<=no-1;i++)
{
if(no%i==0)
{
temp=temp+1;
}
}
if(temp==0)
{
System.out.println("no is prime");
}
else
{
System.out.println("no is not prime");
}
}
}