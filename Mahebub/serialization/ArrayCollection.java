package serialization;

import java.io.*;
import java.util.ArrayList;

class Employee implements Serializable {

	String id;
	String firstName;
	String lastName;

	public Employee(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}

public class ArrayCollection {
	public static void main(String[] args) throws Exception {
		ArrayList<Employee> employees = new ArrayList<>();

		employees.add(new Employee("1", "rakesh", "mehta"));
		employees.add(new Employee("2", "william", "sen"));

		try {
			FileOutputStream fos = new FileOutputStream("employeeData");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employees);
			System.out.println("Objects has been serialized");
			oos.close();
			fos.close();

			System.out.println("Employee Data after Desirialization: ");
			FileInputStream fis = new FileInputStream("employeeData");
			ObjectInputStream ois = new ObjectInputStream(fis);

			employees = (ArrayList) ois.readObject();

			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}