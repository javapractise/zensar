package Practice;
import java.util.*;
public class largestnum {
			public static void main(String[] args) {

				int number, max;
				Scanner s = new Scanner(System.in);
				System.out.print("Enter the number of elements:");
				number = s.nextInt();
				int a[] = new int[number];
				System.out.println("Enter the elements:");
				for(int i = 0; i < number; i++)
				{
				a[i] = s.nextInt();
				}
				max = a[0];
				for(int i = 0; i < number; i++)
				{
				if(max < a[i])
				{
				max = a[i];
				}
				}
				System.out.println("Maximum value in the array is:"+max);
				}
		
	}