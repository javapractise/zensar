package oops;

import java.util.Scanner;

public class member {
		String name="null";
		int age;
		double phnum;
		String address="null";
		float salary;
	void PrintSalary()
	{
		System.out.println(salary);	
	}
	
}




package oops;

import java.util.Scanner;

public class employee extends member{
	 static String specialization;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	member mem=new member();
	mem.name=sc.next();
	mem.age=sc.nextInt();
	mem.phnum=sc.nextDouble();
	mem.address=sc.next();
	specialization=sc.next();
	
System.out.print(mem.name+" "+mem.age+" "+mem.phnum+" "+mem.address+" "+mem.salary+" "+specialization);
	}

}




package oops;

import java.util.Scanner;

public class manager extends member {
static String department;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		member sc1=new member();
		sc1.name=sc.next();
		sc1.age=sc.nextInt();
		sc1.phnum=sc.nextDouble();
		sc1.address=sc.next();
		sc1.salary=sc.nextFloat();
		department=sc.next();
		System.out.print(sc1.name+" "+sc1.age+" "+sc1.phnum+" "+sc1.address+" "+sc1.salary+" "+department);

	}

}
