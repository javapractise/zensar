import java.util.*;

class Number{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

		IntSummaryStatistics stats = list.stream().mapToInt(num-> num).summaryStatistics();

		System.out.println("Count of list : "+stats.getCount());
		System.out.println("Max from list : "+stats.getMax());
		System.out.println("Min from list is: "+ stats.getMin());
		System.out.println("Average of list elements is: "+ stats.getAverage());
		System.out.println("Sum of all list elements is: "+ stats.getSum());
	}
}