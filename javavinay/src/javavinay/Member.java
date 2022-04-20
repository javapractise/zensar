package javavinay;

public class Member {
String name;
int age;
int phn;
String address;
int salary;
public void printsalary() {
	System.out.println(salary);

}
}
class Emp extends Member{
	String specialisation;
}
class Manager extends Member{
	String department;
}
class Test{
public static void main(String[] args) {
	Emp a=new Emp();
	a.name="Vinay";
	a.age=21;
	a.phn=97000000;
	a.address="vij";
	a.salary=45000;
	a.specialisation="java";

	}

}
