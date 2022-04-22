class College
{
	String name="Spec";
	String dept="CSE";
	void display() {
		System.out.println("Name of organization is:"+name);
	}
}
class Student extends College{
	String student="abc";
	void display1() {
		System.out.println("Name of student is:"+student);
	}
}
class Departments extends College{
	void display2()
	{
		System.out.println("Department of studnet is:"+dept);
	}
}
public class Hierarchical{
	public static void main(String[] args)
	{
		Department d= new Department();
		Student s =new Student();
		d.display();
		d.display2();
		s.display();
		s.display1();
	}

}