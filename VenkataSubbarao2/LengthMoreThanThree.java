package training14;

import java.util.Arrays;
import java.util.List;

public class LengthMoreThanThree {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("ssvd", "ss", "d", "sfcss", "sfsfs", "sfsfsfs", "ds");

		long count = words.stream().filter(word -> word.length() > 3).count();

		System.out.println("Count of strings with a length more than three are : "+ count);

	}

}