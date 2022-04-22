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
		s.name = "Subbarao";
		s.roll_no = 1430;
		s.print();

	}

}
