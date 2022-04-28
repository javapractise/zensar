package serialization;

import java.io.*;

class A implements Serializable {
	int i;

	public A(int i) {
		this.i = i;
	}

}

class B extends A {
	int j;

	public B(int i, int j) {
		super(i);
		this.j = j;
	}
}

public class Inheritance {
	public static void main(String[] args) throws Exception {
		B b1 = new B(10, 20);

		System.out.println("i = " + b1.i);
		System.out.println("j = " + b1.j);

		FileOutputStream fos = new FileOutputStream("sample.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(b1);

		oos.close();
		fos.close();

		System.out.println("Object has been serialized");

		FileInputStream fis = new FileInputStream("sample.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		B b2 = (B) ois.readObject();

		ois.close();
		fis.close();

		System.out.println("Object has been deserialized");

		System.out.println("i = " + b2.i);
		System.out.println("j = " + b2.j);
	}
}