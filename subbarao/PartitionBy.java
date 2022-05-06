import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class PartitionBy {

	// Driver code
	public static void main(String[] args)
	{
		// creating an Integer stream
		Stream<Integer>
			s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Map<Boolean, List<Integer> >
			map = s.collect(
				Collectors.partitioningBy(num -> num > 5));


		System.out.println("Elements in stream "
						+ "partitioned by "
						+ "less than equal to 3: \n"
						+ map);
	}
}
