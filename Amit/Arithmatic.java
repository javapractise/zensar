import java.io.*;
import java.util.Scanner;
class Arithmatic{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// when we try ti divide by zero
		try
		{
			System.out.println("Enter a number to get divide by zero : ");
			int n = sc.nextInt();
			int res = n / 0 ;
			System.out.println("Result is "+res);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("\n\tWe can't divide by zero");
		}
	}
}
