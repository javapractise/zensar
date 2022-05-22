import java.util.Scanner;

interface Check{
	boolean res(int n);
}

public class EvenOdd{
	public static void main(String[] args)
	{
		Check c = (n) -> {
			if(n%2==0){	return true;	}
			else{	return false;	}
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		if(c.res(sc.nextInt())){	System.out.println("Number is Even");	}
		else{	System.out.println("Number is Odd");	}

		
	}
}