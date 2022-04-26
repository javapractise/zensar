import java.util.Scanner;

public class arrayindex {
	public static void main(String[] args)
	{
		int a[]= {10,21,43,54};
		int n;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter the index to retrive element:");
			n=sc.nextInt();
			System.out.println("the element in index is"+a[n]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bound exception raised enter the index below 0 to 3");
		}
	}

}
