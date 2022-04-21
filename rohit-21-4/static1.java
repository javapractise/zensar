
interface employee{
	void data();
	static void amount()
	 {
		 System.out.println("Salary amount of the employee is 25000");
	 }
	
}

class company implements employee{
	public void data()
	{
		System.out.println("This is the data of the employee");
	}
}
public class static1 {
	public static void main(String[] args)
	{
		employee c=new company();
		c.data();
		employee.amount();
	}
}
