
interface employee{
	default void salary() {
		System.out.println("the salary of new joined employee is 10000");
	}
	
	void salaryfor(String dis);
	
	static void salaryafter() {
		System.out.println("the salary of new joined employee after a year is 20000");
	}
}

public class defaultmethod implements employee {
	public void salaryfor(String dis)
	{
		System.out.println(dis);
	}
	public static void main(String[] args)
	{
		defaultmethod dm= new defaultmethod();
		dm.salary();
		dm.salaryfor("salary for experienced");
		employee.salaryafter();
	}

}
