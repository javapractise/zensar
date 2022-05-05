package lambdaExpression;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer> even = a -> (a%2 == 0);
		System.out.println(even.test(12));
	}
}
