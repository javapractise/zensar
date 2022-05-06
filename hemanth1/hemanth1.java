package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partition {

	public static void main(String[] args) {
		
		List<Integer> part=new ArrayList<>();
		part.add(1);
		part.add(2);
		part.add(3);
		part.add(4);
		part.add(5);
		part.add(6);
		part.add(7);
		part.add(8);
		
		Map<Boolean, List<Integer>> map=part.stream().collect(Collectors.partitioningBy(s->s%2==0));
		System.out.println(map);
		
	}

}
