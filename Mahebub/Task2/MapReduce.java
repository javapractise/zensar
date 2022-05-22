package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class MapReduce {
	public static void main(String args[]) {
		List<Employees> peoples = new ArrayList<>();
		peoples.add(new Employees(103, "Sam", 25));
		peoples.add(new Employees(104, "John", 27));
		peoples.add(new Employees(105, "Grover", 23));
		peoples.add(new Employees(106, "Adam", 22));
		peoples.add(new Employees(107, "Samy", 224));
		double average = calculateAverage(peoples);
		System.out.println("Average age of employees are (classic way) : " + average);
		average = average(peoples);
		System.out.println("Average age of employees are (lambda way) : " + average);
	}

	private static double calculateAverage(List<? extends Employees> employees) {
		int totalEmployee = employees.size();
		double sum = 0;
		for (Employees e : employees) {
			sum += e.getAge();
		}
		double average = sum / totalEmployee;
		return average;
	}

	private static double average(List<? extends Employees> peoples) {
		return peoples.stream().mapToInt(p -> p.getAge()).average().getAsDouble();
	}
}

class Employees {
	private final int id;
	private final String name;
	private final int age;

	public Employees(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}