package project1;

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



 class Final {



public static void main(String[] args) {



Employee e1 = new Employee();

e1.name = "vaishnavi";
e1.age = 22;
e1.phoneNumber = 70100000;
e1.salary = 30000;
e1.address = "Maharashtra";
e1.department = "Developing";
e1.specilization = "Java Developer";

e1.printSalary();
}
}