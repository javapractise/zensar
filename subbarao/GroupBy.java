import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class  GroupBy{
	public static void main(String[] args)
	{

		// Get the List
		List<String> g
			= Arrays.asList("Subbu", "zensar", "vishnu");


		Map<String, Long> result
			= g.stream().collect(
				Collectors.groupingBy(
					Function.identity(),
					Collectors.counting()));

		// Print the result
		System.out.println(result);
	}
}
