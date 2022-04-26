import java.util.*; 
import java.io.*;   

class NullPointerException
{
	public static void main (String[] args)
	{
		String ptr = null;

		try
		{
			if (ptr.equals("zensar"))
				System.out.print("Same");
			else
				System.out.print("Not Same");
		}
		catch(NullPointerException e)
		{
			System.out.print("NullPointerException Caught");
		}
	}
}
