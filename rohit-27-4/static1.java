

import java.io.*;
import java.io.Serializable;

public class static1 implements Serializable{
	static int age=23;
	public static void main(String[] args)
	{
		static1 s=new static1();
		try
		{
			FileOutputStream fop= new FileOutputStream("rohit1.txt");
			ObjectOutputStream obj= new ObjectOutputStream(fop);
			obj.writeObject(s);
			obj.close();
			fop.close();
			System.out.println("static data is "+age);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}

}
