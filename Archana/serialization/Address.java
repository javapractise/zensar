import java.io.*;

 class Address {

	int num;
	String name;
	Adress() { 
		System.out.println("Constructor called"); 
	}
}

class Demo {
	public static void main(String[] args)
	{
		
		Adress d = new Adress();
		System.out.println(d.name);
		System.out.println(d.num);
	}
}