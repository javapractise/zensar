
import java.util.Scanner;

class Fibonacci{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int n1 = 0, n2 = 1, n3 ,i;
		System.out.println("Enter the number upto which you want to print the FibonacciSeries : ");
		int count = z.nextInt();

		System.out.println(n1+"\n"+n2);
		int[] fib = new int[count];
		fib[0] = 0;
		fib[1] = 1;
		for( i=2; i<count; i++)
		{
			n3 = n2 + n1;
			fib[i] = n3;
			System.out.println(n3);
			n1 = n2; 
			n2 = n3;
		}
		System.out.println("Reversed Series :");
		for(i = count-1 ; i>=0 ; i--)
		{
			System.out.println( fib[i] );
		}
	}
} 