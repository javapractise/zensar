import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class LengthMoreThanThree {
	public static void main(String[] args) {

		List<String> words = Arrays.asList("warner", "ravi", "tagi", "umran", "kumar", "natu", "abhi");

		long count = words.stream().filter(word -> word.length() > 3).count();
List<String> words2 = words.stream().filter(word -> word.length() > 2).collect(Collectors.toList());
		
		System.out.println("List-1 : "+ words);
		System.out.println("List-2 : "+ words2);
		System.out.println("Count of strings with a length more than three are : "+ count);

	}

}