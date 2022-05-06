import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringMore2 {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("ox", "Elephant", "ant", "cow", "dog");
		List<String> newList = list.stream().filter(x -> x.length()> 2).collect(Collectors.toList());
		System.out.println(newList);
	}
}