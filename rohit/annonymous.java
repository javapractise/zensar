
interface salary{
	int salary=25000;
	void display();
}
class employee implements salary{
	public void display()
	{
		System.out.println("Salary of employee="+salary);
	}
}

public class annonymous {
	public static void main(String[] args)
	{
		employee e= new employee();
		e.display();
	}

}
