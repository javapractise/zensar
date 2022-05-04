import java.util.*;
import java.io.*;

class Student
{
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		if(s1.age == s2.age){	return 0;	}
		else if(s1.age>s2.age){	return 1;	}
		else{	return -1;	}
	}
}

public class ComparatorExample
{
	public static void main(String[] args)
	{
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(101, "John", 23));
		a1.add(new Student(102, "Mike", 27));
		a1.add(new Student(103, "David", 21));

		System.out.println("Sorting by age : ");
		Collections.sort(a1, new AgeComparator());
		for(Student st:a1){
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}
}