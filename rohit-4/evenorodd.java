

import java.util.Scanner;
interface odd{
	void even(int a);
}

public class evenorodd {
	public static void main(String[] args)
	{
		odd o= (int a)->{
			if(a%2==0)
			{
				System.out.println("is even");
			}
			else
			{
				System.out.println("is odd");
			}
		};
		o.even(3);
	}
}
