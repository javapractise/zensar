import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionBy {
	public static void main(String[] args)
	{
     Stream<Integer>
     s = Stream.of(10, 11, 12, 13, 14, 4, 1, 2, 3);
     Map<Boolean, List<Integer> >
     map = s.collect(Collectors.partitioningBy(num -> num > 3));
     System.out.println("Elements in stream partitioned by greater than equal to 5: \n" + map);
	}
}