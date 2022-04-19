class Prime
{
public static void main(String args[])
{
int num =20;
boolean flag=false;
for(int i=2;i<=num/2;++i)
{
if(num%i==0)
{
flag=true;
break;
}
}
if(!flag)
{
System.out.println(num+ "the num is prime");
}
else
{
System.out.println(num+ "the num is not a prime");
}
}
}



 