import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args)
	{
		// Creating predicate
		Predicate<Integer> age = i -> (i  > 18);
		// To Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age :");
		int n = sc.nextInt();
		// Calling Predicate method to check the eligiblity for voting
		if(age.test(n))
		{	System.out.println("Eligible for voting");	}
		else
		{	System.out.println("Not Eligible for voting");	}
	}
}