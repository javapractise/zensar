public class ArithmeticExp {


void division(int a,int b)
{
int c=a/b;
System.out.println("Division has been successfully done");
System.out.println("Value after division: "+c);
}
public static void main(String[] args)
{
	 ArithmeticExp ex=new  ArithmeticExp();
ex.division(10,0);
}
} 