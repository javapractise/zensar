package streamsPrograms;

import java.util.*;

public class Numbers {
	public static void main(String[] args) {
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Total numbers are: "+stats.getCount());
		System.out.println("Minimum number from list: "+stats.getMin());
		System.out.println("Maximum number from list: "+stats.getMax());
		System.out.println("Sum of numbers: "+stats.getSum());
		System.out.println("Average of numbers: "+stats.getAverage());
	}
}