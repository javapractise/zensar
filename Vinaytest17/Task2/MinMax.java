import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
public class MinMax {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 243,42,5,23,52,78,1,4);
		IntSummaryStatistics stats = nums.stream().mapToInt(num -> num).summaryStatistics();
		System.out.println("Count of list is: "+ stats.getCount());
		System.out.println("Min of list is: "+ stats.getMin());
		System.out.println("Max of list is: "+ stats.getMax());
		System.out.println("Average of list is: "+ stats.getAverage());
		System.out.println("Sum of list is: "+ stats.getSum());
	}

}