import java.io.*;

 class Adress {

	int num;
	String name;

	
	Adress() { 
		System.out.println("Constructor called"); }
}

class Demo {
	public static void main(String[] args)
	{
		// this would invoke default constructor.
		Adress d = new Adress();

		
		System.out.println(d.name);
		System.out.println(d.num);
	}
}
