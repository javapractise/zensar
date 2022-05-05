package training14;

import java.util.Arrays;
import java.util.List;

public class CountEmptyString {

	public static void main(String[] args) {
		
		List<String> locations = Arrays.asList("Chennai", "", "", "Hyderbad", "America", "");
		
		long count = locations.stream().filter(location -> location.isEmpty()).count();
		
		System.out.println("Count of empty strings in locations are : "+ count);

	}

}
