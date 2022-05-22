package lambdaExpression;

@FunctionalInterface
interface EvenOddExample {
	public void evenOdd(int a);
}

public class EvenOdd {
	public static void main(String[] args) {
		EvenOddExample e = (a) -> {
			if(a%2 == 0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		};
		
		e.evenOdd(9);
	}
}
