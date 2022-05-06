import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class PartitionByExample {

	public static void main(String[] args) {
		
		Stream<Integer> n = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Map<Boolean, List<Integer>> map = n.collect(Collectors.partitioningBy(num -> num %2==0 ));
		
		System.out.println(map);

	}

}