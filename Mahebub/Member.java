package com.zensar.inheritance;

public class Member {
	String name;
	int age;
	long phoneNumber;
	String address;
	int salary;
	
	public Member(String name, int age, long phoneNumber, String address, int salary) {
		this.name=name;
		this.age=age;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
	}
	
	public Member() {
	}

	public void printSalary() {
		System.out.println("The salary of the member is: "+salary);
	}
}

class Employee extends Member {
	String specialization;
	String department;
	public Employee(String name, int age, long phoneNumber, String address, int salary, String specialization,
	String department) {
		super(name, age, phoneNumber, address, salary);
		this.specialization=specialization;
		this.department=department;
	}
}

class Manager extends Member {
	String specialization;
	String department;
	public Manager(String name, int age, long phoneNumber, String address, int salary, String specialization,
			String department) {
		super(name, age, phoneNumber, address, salary);
		this.specialization=specialization;
		this.department=department;
	}
}

class Test1{
	public static void main(String[] args) {
		Employee e = new Employee("Mahebub", 26, 1234567890, "Pune", 30000, "Computer Science", "Development");
		Manager m = new Manager("Sager", 26, 1987654321, "Nagpur", 40000, "Information Technology", "HR");
		e.printSalary();
		m.printSalary();
		System.out.println("Name:"+e.name+" Age:"+e.age+" Phone Number:"+e.phoneNumber+" Address:"+e.address+" Salary:"+e.salary+" Specialization:"+e.specialization+" Department:"+e.department);
		System.out.println("Name:"+m.name+" Age:"+m.age+" Phone Number:"+m.phoneNumber+" Address:"+m.address+" Salary:"+m.salary+" Specialization:"+m.specialization+" Department:"+m.department);
	}
}
