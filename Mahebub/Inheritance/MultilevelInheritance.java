package com.zensar.inheritance;

public class MultilevelInheritance {
	int emp_id;
	String name;
	String department;
	int salary;
	public MultilevelInheritance(int emp_id, String name, String department, int salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public void info() {
		System.out.println("It is a employee information");
	}
}

class Developer extends MultilevelInheritance {

	public Developer(int emp_id, String name, String department, int salary) {
		super(emp_id, name, department, salary);
	}
	
	public void details() {
		System.out.println("emp_id: "+emp_id+" name: "+name+" Department: "+department+" salary: "+salary);
	}
}

class JavaDeveloper extends Developer {
	public JavaDeveloper(int emp_id, String name, String department, int salary) {
		super(emp_id, name, department, salary);
	}
}

class Test2 {
	public static void main(String[] args) {
		JavaDeveloper j = new JavaDeveloper(003, "Smith", "Development", 28000);
		j.info();
		j.details();
	}
}
