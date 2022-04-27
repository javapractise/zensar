package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeSerialVersion {
	public static void main(String[] args) {

		SerialVersion sv = null;
		try {
			FileInputStream fileIn = new FileInputStream("employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			sv = (SerialVersion) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
		}
		System.out.println("Deserialized Employee: ");
		System.out.println("Emp id: " + sv.employeeId);
		System.out.println("Name: " + sv.employeeName);
		System.out.println("Department: " + sv.department);
	}
}