package practice;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;



public class Thursday{




public static void main(String[] args) {
List<Integer> list = Arrays.asList(5, 2, 1, 6, 7, 8, 6, 7, 9, 7, 8, 9);
IntSummaryStatistics n = list.stream().mapToInt((x) -> x).summaryStatistics();
System.out.println(n);
}




}