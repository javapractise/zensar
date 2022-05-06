import java.util.*;
import java.util.stream.Collectors;

public class Square{
	public static void main(String[] args)
	{
		List<Integer> num = Arrays.asList(1, 2, 1, 4, 5, 2, 7, 8, 9, 8);
		System.out.println(num.stream().distinct().map(n->n+"\t"+n*n).collect(Collectors.joining("\n")));
	}
}