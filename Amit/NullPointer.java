import java.io.*;
import java.util.Scanner;

class NullPointer{
	public static void main(String[] ars)
	{
		Scanner sc = null;
		// Trying to take a number using a object referance of
		// scanner which is set to null

		try
		{
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();	
		}
		catch(NullPointerException n)
		{
			System.out.println("\n\tException is get Handelled inside the Catch Block");
		}
		
	}
}