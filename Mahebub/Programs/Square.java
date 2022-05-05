package streamsPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class Square {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println(distinct);
	}
}
