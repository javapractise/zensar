class Student{
	String name;
	int rollno;
	Student(int rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	public static void main(String[] args)
	{
		Student s = new Student(2, "John");
		System.out.println("Roll No.: "+s.rollno+"\nName: "+s.name);
	}
}