import java.util.Scanner;
class Swap
{
public static void main(String args[])
{
int a,b,temp;
System.out.print("enter two number:");
Scanner r = new Scanner(System.in);
a=r.nextInt();
b=r.nextInt();
System.out.println("Before Swapping "+ a+" "+b);



temp=a;
a=b;
b=temp;
System.out.println("After Swapping "+ a+" "+b);
}
}

