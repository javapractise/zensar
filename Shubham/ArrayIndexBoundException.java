import java.util.*; 
import java.io.*;   

public class ArrayIndexBoundException {
	public static void main(String[] args)
	{
		int ar[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i <= ar.length; i++)
			System.out.println(ar[i]);
	}
}
