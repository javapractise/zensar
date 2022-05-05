import java.util.*;
import java.util.stream.*;

public class DuplicateStream {

	  public static void main(String args[]) {
          List<Integer> myList = Arrays.asList(20,16,28,49,25,98,98,32,16);
          Set<Integer> set = new HashSet();
          myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);
  }
	
}