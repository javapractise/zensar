package training;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 5, b = 2, c;
		System.out.println("Before Swaping");
		System.out.println("a = "+ a + " b = " +b );
		c = a;
		a = b;
		b = c;

		System.out.println("After Swaping");
		System.out.println("a = "+ a + " b = " +b );

	}

}