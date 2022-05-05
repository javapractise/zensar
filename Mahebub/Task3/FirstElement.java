package streams;

import java.util.*;

public class FirstElement {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		myList.stream().findFirst().ifPresent(a -> System.out.println(a));
	}
}