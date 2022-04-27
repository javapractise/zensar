
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;





class A implements Serializable
{
	int i;
	
	// parameterized constructor
	public A(int i)
	{
		this.i = i;
	}
	
}


class B extends A
{
	int j;
	
	// parameterized constructor
	public B(int i, int j)
	{
		super(i);
		this.j = j;
	}
}

//Driver class
public class SerializationInheritance
{
	public static void main(String[] args)
			throws Exception
	{
		B b1 = new B(10,20);
		
		System.out.println("i = " + b1.i);
		System.out.println("j = " + b1.j);
		
	
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
			
		
		oos.writeObject(b1);
			
	
		oos.close();
		fos.close();
			
		System.out.println("Object has been serialized");
		
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
			
	
		B b2 = (B)ois.readObject();
			

		ois.close();
		fis.close();
			
		System.out.println("Object has been deserialized");
		
		System.out.println("i = " + b2.i);
		System.out.println("j = " + b2.j);
	}
}
