import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(12, 243,42,5,23,52,78,1,4);
		
		List<Integer> sqrs =  nums.stream().map(num -> num*num).collect(Collectors.toList());
		
		System.out.println(sqrs);

	}

}