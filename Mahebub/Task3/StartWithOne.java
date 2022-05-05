package streams;

import java.util.*;

public class StartWithOne {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 13, 25, 17, 32);
		myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(s -> System.out.println(s));
	}
}