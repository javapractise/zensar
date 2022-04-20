class Member{
	String name;
	int age;
	String ph_no;
	String add;
	int sal;

	public void printSalary()
	{
		System.out.println(sal);
	}
}

class Employee extends Member{
	String specialization;
	
	Employee(String name, int age, String ph_no, String add, int sal)
	{
		super.name = name;
		super.age = age;
		super.ph_no = ph_no;
		super.add = add;
		super.sal = sal;

		System.out.println("Name :"+name+"\nAge :"+age+"\nPhone Number :"+ph_no+"\nAddress :"+add+"\nSalary :"+sal);
		System.out.println("\n==========================\n");
	}
}

class Manager extends Member{
	String department;

	Manager(String name, int age, String ph_no, String add, int sal)
	{
		super.name = name;
		super.age = age;
		super.ph_no = ph_no;
		super.add = add;
		super.sal = sal;

		System.out.println("Name :"+name+"\nAge :"+age+"\nPhone Number :"+ph_no+"\nAddress :"+add+"\nSalary :"+sal);
		
	}
}

public class Third{
	public static void main(String args[])
	{
		Employee e = new Employee("John", 32,"9876543210", "Delhi", 70000);
	
		Manager m = new Manager("Mike", 22, "987654320", "Noida", 30000);
	}
}