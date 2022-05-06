package practice;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
public class Thursday {
public static void main(String[] args) {
List<String> strings = Arrays.asList("hemanth" ,"", "naveen", "");
int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
System.out.println(count);
}
}