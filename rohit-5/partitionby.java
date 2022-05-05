import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class partitionby{
	public static void main(String[] args) {
		Stream<Integer> l1 = Stream.of(21, 24, 35, 42, 52, 6, 7, 8, 9, 10,100);
		
		Map<Boolean, List<Integer>> map = l1.collect(Collectors.partitioningBy(i -> i >15));
		System.out.println(map);

	}

}