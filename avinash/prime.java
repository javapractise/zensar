class prime
{
public static void main(String args[])
{
int num=29;
boolean isPrime = true;
for(int i=2;i<=num;i++)
{
if(num%i==0)
{
isPrime = false;
break;
}
}
if(isPrime)
{
System.out.println(num + "is a prime number");
}
else
{
System.out.println("not a prime number");
}
}
}
