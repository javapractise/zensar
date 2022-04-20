package com.zensar.inheritance;

public class Student {
	String name;
	int roll_no;
	public Student(String name, int roll_no) {
		this.name = name;
		this.roll_no = roll_no;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(roll_no);
	}
}

class test7 {
	public static void main(String[] args) {
		Student s = new Student("John", 2);
		s.info();
	}
}
