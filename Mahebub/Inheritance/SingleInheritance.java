package com.zensar.inheritance;

public class SingleInheritance {
	int emp_id;
	String name;
	String department;
	int salary;
	public SingleInheritance(int emp_id, String name, String department, int salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public void info() {
		System.out.println("It is a employee information");
	}
}

class Manager extends SingleInheritance {

	public Manager(int emp_id, String name, String department, int salary) {
		super(emp_id, name, department, salary);
	}
	
	public void info() {
		System.out.println("emp_id: "+emp_id+" name: "+name+" Department: "+department+" salary: "+salary);
	}
}

class Test1 {
	public static void main(String[] args) {
		Manager m = new Manager(001, "Mahebub", "Development", 30000);
		m.info();
	}
}


