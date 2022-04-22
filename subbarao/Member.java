class Member {
	String name, address;
	int age, phoneNumber, salary;

	public void printSalary() {
		System.out.print(salary);
	}

}

class Manager extends Member {
	String specilization, department;

	public void printSalary(){
		System.out.println(department);
	}
}

class Employee extends Member {
	String specilization, department;
}

public class Question3 {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.name = "Akhil Siddabattula";
		e1.age = 22;
		e1.phoneNumber = 867538370;
		e1.salary = 50000;
		e1.address = "Andhra Pradesh";
		e1.department = "Developing";
		e1.specilization = "Java Developer";

		e1.printSalary();

		Manager m1 = new Manager();
		e1.name = "Subbarao Kalluri";
		e1.age = 22;
		e1.phoneNumber = 635410000;
		e1.salary = 100000;
		e1.address = "Andhra Pradesh";
		e1.department = "Developing";
		e1.specilization = "hdsdssf";

		m1.printSalary();
	}
}