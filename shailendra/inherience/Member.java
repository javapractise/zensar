package com.java.inherience;

public class Member

{
	String name;
	int Age;
	int phoneNumber;
	String Address;
	int Salary;

	public void printSalary() {
		System.out.println("Member name :"+name+"Salary"+Salary);
	}


}
class Employee extends Member {

	String specialization;

}

class Manager extends Member {

	String department;


}