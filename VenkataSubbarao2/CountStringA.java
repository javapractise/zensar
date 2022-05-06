package training14;

import java.util.Arrays;
import java.util.List;

public class CountStringA {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("asvd", "ss", "add", "sfcss", "sfsfs", "sfsfsfs", "ads");

		long count = words.stream().filter(word -> word.startsWith("a", 0)).count();

		System.out.println("Count of strings starting with letter \"a\" : "+ count);

	}

}