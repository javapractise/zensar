package streams;


	import java.util.*;
	import java.util.function.Function;
	import java.util.stream.Collectors;

	public class maxval {

		public static void main(String[] args) {

			List<String> words = Arrays.asList("Hyderabad", "America", "Chennai", "Pune", "Hyderabad", "Bangalore", "Chennai", "America" );

			Map<String, Long> output = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

			System.out.println(output);
		}

	}
	