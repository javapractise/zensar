/*method overloading*/

class employee{
	String name;
	int age;
	int pincode;
	 int display(int salary,int age)
	{
		 System.out.println("salary:"+salary+","+"age:"+age);
		 return salary;
			
	}
	int display(int salary,int age,int pincode)
	{
		System.out.println("salary:"+salary+","+"age:"+age+","+"pincode"+pincode);
		return pincode;
	}
}

public class overloading {
	public static void main(String[] args)
	{
		employee e =new employee();
		e.display(3000,23);
		e.display(45000,25,522503);
	}

}
