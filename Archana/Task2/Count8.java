import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Count8 {

	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 3, 4, 5, 5, 6, 7, 7, 7, 8, 9);
		IntSummaryStatistics s = list.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(s);
	}

	
}