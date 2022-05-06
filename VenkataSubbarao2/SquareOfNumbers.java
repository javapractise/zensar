package training14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumbers {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> sqrs =  nums.stream().map(num -> num*num).collect(Collectors.toList());

		System.out.println(sqrs);

	}

}