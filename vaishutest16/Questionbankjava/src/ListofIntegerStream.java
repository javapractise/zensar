

//Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
import java.util.*;
import java.util.stream.*;

public class ListofIntegerStream 
{
public static void main(String args[]) {
	
List<Integer> mylist= Arrays.asList(5,10,15,12,19);
mylist.stream()

.map(s -> s + "") // Convert integer to String
.filter(s -> s.startsWith("1"))
.forEach(System.out::println);
 }
	
	
}