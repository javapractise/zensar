package Inheritance;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Thursday {

		public static void main(String[] args) {
			List<String> strList = Arrays.asList("abc", "", "bc", "", "defg", "jklm", "");
			List<String> s = strList.stream() .filter(x -> x.length()> 2) .collect(Collectors.toList());
			System.out.println(s);
		}
	}