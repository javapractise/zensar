package streams;

import java.util.*;

public class DescendingSort {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 8, 49, 25, 98, 32, 15);

		myList.stream().sorted(Collections.reverseOrder()).forEach(a -> System.out.println(a));
	}
}