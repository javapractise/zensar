/*Method Overloading*/

class Employee{
	String name;
	int age;
	int phnnbr;
	 int display(int salary,int age)
	{
		 System.out.println("salary:"+salary+","+"age:"+age);
		 return salary;
			
	}
	int display(int salary,int age,int phnnbr)
	{
		System.out.println("salary:"+salary+","+"age:"+age+","+"phnnbr"+phnnbr);
		return phnnbr;
	}
}

public class MethodOverloading {
	public static void main(String[] args)
	{
		Employee e =new Employee();
		e.display(30000,30);
		e.display(50000,25,9876543210);
	}

}