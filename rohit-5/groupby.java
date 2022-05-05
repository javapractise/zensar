
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class groupby {
	public static void main(String[] args)
	{
		List<String> l1= Arrays.asList("rohit","krishna","rohit","sameer");
		Map<String, Long> res= l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(res);
	}
}
