import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
 public class Distinct 
{
    public static void main(String[] args)
	{
	
	
    List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream()
                                         .map( i -> i*i).distinct()
                                         .collect(Collectors.toList());
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n",
                                          numbers, distinct);
 
	}
}
//
C:\Users\SC67784\repo\SAMPLE>javac Distinct.java

C:\Users\SC67784\repo\SAMPLE>java Distinct.java
Original List : [9, 10, 3, 4, 7, 3, 4],  Square Without duplicates : [81, 100, 9, 16, 49]