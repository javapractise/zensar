package practice;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Thursday {



public static void main(String[] args) {
List<String> strList = Arrays.asList("hemanth", "", "naveen", "", "hari", "kiran");
List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
System.out.println(filtered);
}
}