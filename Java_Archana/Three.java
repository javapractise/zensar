package practice2;
class Member {
	String name,address;
	int age,phnnbr,salary;
	public void printsalary(){
		//System.out.println(name+" "+ address+" " +age+ " "+ phnnbr);
		System.out.println("salary:" +salary);
	}
}
class Employee extends Member{
	String specification;
}
class Manager extends Member{
	String department;
}

public class Three {
	public static void main(String args[]){		
		Employee e=new Employee();
		e.name="a";
		e.age=23;
		e.address="hyd";
		e.phnnbr=987654;
		e.salary=2;
		e.specification="software";
		e.printsalary();
		System.out.println(e.specification+" "+e.name+" "+ e.address+" " +e.age+ " "+ e.phnnbr);
		Manager m=new Manager();
		m.department="dev";
		m.name="ab";
		m.age=23;
		m.address="yd";
		m.phnnbr=7654;
		m.salary=20;
		m.printsalary();
		System.out.println(m.department+" "+m.name+" "+ m.address+" " +m.age+ " "+ m.phnnbr);
	}
	
}
