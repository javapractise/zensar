package streamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoreThanTwo {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bc", "", "defg", "jkput", "");
		List<String> filtered = strList.stream() .filter(x -> x.length()> 2) .collect(Collectors.toList());
		System.out.println(filtered);
	}
}
