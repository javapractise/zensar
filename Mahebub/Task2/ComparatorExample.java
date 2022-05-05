package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class ComparatorExample {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(115, "Adithya", 25000.00));
		list.add(new Employee(125, "Jai", 30000.00));
		list.add(new Employee(135, "Chaitanya", 40000.00));
		System.out.println("Sorting the employee list based on the name");

		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		for (Employee e : list) {
			System.out.println(e.id + " " + e.name + " " + e.salary);
		}
	}
}