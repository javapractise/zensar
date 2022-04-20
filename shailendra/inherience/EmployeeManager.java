package com.java.inherience;

public class EmployeeManager {

	public static void main(String[] args) {
	Employee employee =new Employee();
			employee.name = "Shaielndra";
			employee.Age = 22;
			employee.phoneNumber = 12345677;
			employee.Address = "Pune";
			employee.Salary = 2500000;
			employee.specialization = "Java";
			employee.printSalary();

			Manager manager = new Manager();
			manager.name = "Jayesh";
			manager.name = "Shaielndra";
			manager.Age = 22;
			manager.phoneNumber = 12345677;
			manager.Address = "Pune";
			manager.Salary = 2500000;
			manager.department = "Human Resource";
			manager.printSalary();

		}
	}


	


