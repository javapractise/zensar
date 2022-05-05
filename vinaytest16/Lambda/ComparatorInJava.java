package vinaytest16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import vinaytest16.Employee;
public class ComparatorInJava {

	public class ComparatorsInJava8 {
	  static List<Employee> employeeList = 
	      Arrays.asList(new Employee("Tom Jones", 45), 
	        new Employee("Harry Major", 35),
	        new Employee("Harry Major", 25), 
	        new Employee("Ethan Hardy", 65), 
	        new Employee("Nancy Smith", 15),
	        new Employee("Deborah Sprightly", 29));
	  public static void main(String[] args) {
	    Comparator<Employee> empNameComparator = (Employee emp1, Employee emp2) -> {
	      return (emp1.getName().compareTo(emp2.getName()));
	    };
	    Collections.sort(employeeList, empNameComparator);
	    employeeList.forEach(System.out::println);
	  }
	}
}