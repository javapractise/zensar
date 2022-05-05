package streamsPrograms;

import java.util.Arrays;
import java.util.List;

public class StartWithA {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bcdst", "a", "adefg", "jkput", "a");
		long count = strList.stream() .filter(x -> x.startsWith("a")) .count();
		System.out.println(count);
	}
}
