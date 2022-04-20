
class member {
	String name;
	int age;
	int phonenum;
	String address;
	int salary;
	void printsalary() {
		System.out.println("name:"+name);
		System.out.println("age:"+ age);
		System.out.println("phone number"+ phonenum);
		System.out.println("salary of the members:"+ salary);
	}
}
class employee extends member{
	String specialization;
	String department;
	void empdisp() {
		System.out.println("specialization-"+specialization);
		System.out.println("department-"+department);
	}
}
class manager extends member{
	String specialization;
	String department;
	void mandisp() {
		System.out.println("specialization-"+specialization);
		System.out.println("department-"+department);
		
	}	}

public class three{
	public static void main(String[] args){
		employee e=new employee();
		manager m= new manager();
		e.name = "rohit";
		e.age = 23;
		e.phonenum = 98855233;
		e.salary = 30000;
		e.address = "Andhra Pradesh";
		e.department = "Developing";
		e.specialization = "microservices";
		e.printsalary();	
	}
}

