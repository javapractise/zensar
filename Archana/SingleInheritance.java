class College
{
	String name="Spec";
	void display() {
		System.out.println("Name of clg is:"+name);
	}
}
class Student extends College{
	String student="abc";
	void display1() {
		System.out.println("Name of student is:"+student);
	}
}
public class SingleInheritance{
	public static void main(String[] args)
	{
		Student s= new Student();
		s.display();
		s.display1();
	}

}