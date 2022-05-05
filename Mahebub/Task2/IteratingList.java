package lambdaExpression;

import java.util.ArrayList;

public class IteratingList {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Watermelon");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		
		fruits.forEach((f) -> System.out.println(f));
	}
}
