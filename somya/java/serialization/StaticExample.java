package serialization;

import java.io.*;

public class StaticExample implements Serializable {
	static int id = 10;

	public static void main(String[] args) {
		StaticExample ob = new StaticExample();
		System.out.println("At the time of Serialization, static member has value : " + id);
		try {
			FileOutputStream fos = new FileOutputStream("static.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ob);
			oos.close();
			id = 9;

			FileInputStream fis = new FileInputStream("static.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ob = (StaticExample) ois.readObject();
			System.out.println("After Deserialization, static member has value : " + id);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}