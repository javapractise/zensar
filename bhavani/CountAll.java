import java.util.*;
import java.util.stream.Collectors;
  
public class CountAll{
    public static void main(String args[])
    {
  
List<Integer> numbers = Arrays.asList(10, 3, 2, 5, 9, 4);
 
IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
 
stats.getCount();
stats.getMin();
stats.getMax();
stats.getSum();
stats.getAverage();
}
}     
       
