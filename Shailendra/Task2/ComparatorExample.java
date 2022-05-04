package com.java.java8feature;

import java.util.ArrayList;

import java.util.Comparator;

public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Shailendra", 3434));
		list.add(new Student("Raju", 1212));
		list.add(new Student("Rohit", 6565));
		list.add(new Student("Pravin", 4954));
		list.add(new Student("Varsha", 1212));
		list.add(new Student("Siu", 0001));

		System.out.println("unsorted");
		list.forEach((e) -> {
			System.out.println(e.name + " " + e.roll);
		});

		System.out.println();
		System.out.println("sorted");
		list.sort(new SortRoll());
		list.forEach((e) -> {
			System.out.println(e.name + " " + e.roll);
		});
		System.out.println();
		list.sort(new SortName());
		list.forEach((e) -> {
			System.out.println(e.name + " " + e.roll);
		});

	}

}

class Student {
	String name;
	int roll;

	public Student() {
		super();
	}

	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
}

class SortRoll implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.roll == s2.roll) {
			return 0;
		} else if (s1.roll > s2.roll) {
			return 1;

		} else
			return -1;

	}

}

class SortName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);// For asc
		// return o2.name.compareTo(o1.name);//for desc

	}

}
