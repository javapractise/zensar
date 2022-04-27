package serialization;

import java.io.*;

class Studentinfo implements Serializable {
	String name;
	int rid;
	static String contact;

	Studentinfo(String n, int r, String contact) {
		this.name = n;
		this.rid = r;
	}
}

public class SerializationExample {
	public static void main(String[] args) {
		try {
			Studentinfo si = new Studentinfo("Abhi", 104, "110044");
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
			System.out.println("StudentInfo has been serialized");
			oos.flush();
			oos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
