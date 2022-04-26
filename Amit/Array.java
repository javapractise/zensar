import java.lang.*;
import java.util.*;

class Array{
	public static void main(String[] args)
	{
		try 
		{
			int[] arr = {10, 20, 30, 40, 50};
			// Here length of array is 5 
			// but if we try to access the element at 6th postion
			// then we get the ArrayIndexOutOfBoundException
			for(int i=0 ; i < 6 ; i++)
			{
				System.out.print(arr[i]+"\t");
			}
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("\n\n\tArrayIndexOutOfBoundException is Handelled");
		}
		

	}
}