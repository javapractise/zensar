package streamsPrograms;

import java.util.Arrays;
import java.util.List;

public class MoreThanThree {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bcdst", "", "defg", "jkput", "");
		long num = strList.stream().filter(x -> x.length() > 3).count();
		System.out.println(num);
	}
}
