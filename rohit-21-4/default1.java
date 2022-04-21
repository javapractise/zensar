
interface employee{
	void data();
	 default void amount()
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
public class default1 {
	public static void main(String[] args)
	{
		company c=new company();
		c.data();
		c.amount();
	}
}
