package streams;

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class SortValues {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 8, 49, 25, 98, 32, 15);

		myList.stream().sorted().forEach(a -> System.out.println(a));
	}
}