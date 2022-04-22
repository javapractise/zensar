package com.zensar.inheritance;

public class HierarchicalInheritance {
	int emp_id;
	String name;
	String department;
	int salary;
	public HierarchicalInheritance(int emp_id, String name, String department, int salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public void info() {
		System.out.println("It is a employee information");
	}
}

class Development extends HierarchicalInheritance {

	public void info() {
		System.out.println("This is Developer information");
		System.out.println("emp_id: "+emp_id+" name: "+name+" Department: "+department+" salary: "+salary);
	}
	
	public Development(int emp_id, String name, String department, int salary) {
		super(emp_id, name, department, salary);
	}
}

class Testing extends HierarchicalInheritance {

	public void info() {
		System.out.println("This is tester information");
		System.out.println("emp_id: "+emp_id+" name: "+name+" Department: "+department+" salary: "+salary);
	}
	
	public Testing(int emp_id, String name, String department, int salary) {
		super(emp_id, name, department, salary);
	}
}

class Test3 {
	public static void main(String[] args) {
		Development d = new Development(004, "Johny", "Python Developer", 35000);
		d.info();
		Testing t = new Testing(005, "Henry", "Automation Tester", 25000);
		t.info();
	}
}