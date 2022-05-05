import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByCount
 {

	public static void main(String[] args)
	{

	
		List<String> strings = new ArrayList<>();

		strings.add("Hello");
		strings.add("swapna");
		strings.add("Hello");
		strings.add("Gopi");
		strings.add("Hello");
		strings.add("krishna");
		strings.add("Hello");
		Map<String, Long> countMap = strings.stream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Count : "+countMap);
	}
}
//
C:\Users\SC67784\repo\SAMPLE>javac GroupingByCount.java

C:\Users\SC67784\repo\SAMPLE>java GroupingByCount.java
Count : {Gopi=1, Hello=4, krishna=1, swapna=1}


