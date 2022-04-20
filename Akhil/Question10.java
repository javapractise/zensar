package training2;

class Student {
	String name;
	int roll_no;
	
	public void print() {
		System.out.println("Name :" + name + " Roll No :" + roll_no);
	}
}

public class Question10 {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "Akhil";
		s.roll_no = 12345;
		s.print();

	}

}
