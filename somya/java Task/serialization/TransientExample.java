package serialization;
import java.io.*;

public class TransientExample implements Serializable {
	transient int i = 10;

	public static void main(String[] args) {
		TransientExample ob = new TransientExample();
		System.out.println("Before Serialization object has value : " + ob.i);
		try {
			FileOutputStream fos = new FileOutputStream("transient.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ob);
			oos.close();
			FileInputStream fis = new FileInputStream("transient.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ob = (TransientExample) ois.readObject();
			ois.close();
			System.out.println("After Deserialization restored object has value : " + ob.i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
© 2022 GitHub, Inc.
Terms
Privacy
Security
Stat