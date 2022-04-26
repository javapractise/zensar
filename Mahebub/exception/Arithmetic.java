package exception;

public class Arithmetic {
	public static void main(String[] args) {
		try {
			int a=10, b=0;
			int result = 10/0;
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("Divide by zero not possible");
			e.printStackTrace();
		}
	}
}
