package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeSerialVersion {
	public static void main(String[] args) {

		SerialVersion sv = new SerialVersion(101, "johny", "Development");
		try {
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(sv);
			System.out.println("Object serialized");
			outStream.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}