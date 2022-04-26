public class ArithmeticException
{
		void division(int a,int b)
		{
			int c=a/b;
			System.out.println("Division of a number is successful");
			System.out.println("Output of division: "+c);
		}
	public static void main(String[] args)
	{
		ArithmeticException ex=new ArithmeticException();
		ex.division(10,5);
	}
}

output:

C:\Users\SC67784\repo\SAMPLE>javac ArithmeticException.java

C:\Users\SC67784\repo\SAMPLE>java ArithmeticException.java
Division of a number is successful
Output of division: 2
