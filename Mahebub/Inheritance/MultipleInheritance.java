package com.zensar.inheritance;

public class MultipleInheritance {
	int emp_id=002;
	String name="Smith";
	String department="Testing";
	int salary=25000;
	
	public void info() {
		System.out.println("emp_id: "+emp_id+" name: "+name+" Department: "+department+" salary: "+salary);
	}
}

class Candidate {
	String name="Justin";
	String specialization="Computer Science";

	public void details() {
		System.out.println("name: "+name+" Specialization: "+specialization);
	}
}

class Tester extends MultipleInheritance, Candidate{
	public static void main(String args[]) {
		Tester t = new Tester();
		t.info();
		t.details();
	}
}