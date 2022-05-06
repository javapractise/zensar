package Inheritance;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Thursday {

		public static void main(String[] args) {
			List<String> strList = Arrays.asList("abc", "", "bcdst", "", "defg", "jkput", "");
			List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
			System.out.println(filtered);
		}
	}