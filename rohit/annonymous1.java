
interface salary{
	int salary=25000;
	void display();
}

public class annonymous1 {
	public static void main(String[] args)
	{
		salary s1= new salary()
		{
		public void display()
		{
			System.out.println("Salary of employee="+salary);
		}
		};
		s1.display();
	}

}
