package training14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthMoreThanTwo {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("ssvd", "ss", "d", "sfcss", "sfsfs", "sfsfsfs", "ds");

		List<String> words2 = words.stream().filter(word -> word.length() > 2).collect(Collectors.toList());
		
		System.out.println("List-1 : "+ words);
		System.out.println("List-2 : "+ words2);

	}

}
