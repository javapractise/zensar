package training14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinString {

	public static void main(String[] args) {

		List<String> locations = Arrays.asList("Chennai", "Hyderbad", "America", "Pune");

		String result = locations.stream().map(location -> location.toUpperCase()).collect(Collectors.joining(", "));

		System.out.println(result);

	}

}