package streams;

import java.util.*;

public class MaximumValue {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 101, 32, 15);
		int max = myList.stream().max(Integer::compare).get();
		System.out.println(max);
	}
}