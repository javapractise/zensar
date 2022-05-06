import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBy{
	public static void main(String[] args)
	{
 
		List<String> g = Arrays.asList("cars","bikes","cars","auto","bikes","boats","jet");
 		
		Map<String, Long> result = g.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
 
		// Print the result
		System.out.println(result);
    }
}
