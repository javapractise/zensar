import java.util.Arrays;
import java.util.List;
public class CountString {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("warner", "ravi", "tagi", "umran", "kumar", "natu", "abhi");
		long count = words.stream().filter(word -> word.startsWith("a", 0)).count();
		System.out.println("Count of strings starting with letter \"a\" : "+ count);

	}

}