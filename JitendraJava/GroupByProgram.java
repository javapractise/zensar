package javaprogram;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class  GroupByProgram{
	public static void main(String[] args)
	{
		List<String> l = Arrays.asList("Jitendra", "Gupta", "Mumbai");
		Map<String, Long> result = l.stream().collect(
				Collectors.groupingBy(
					Function.identity(),
					Collectors.counting()));
		System.out.println(result);
	}
}