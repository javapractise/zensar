
import java.io.*;
import java.io.Serializable;

class address implements Serializable{
	String area;
	String pin;
	address(String area,String pin)
	{
		this.area=area;
		this.pin=pin;
	}
}
class employee extends address{
	String name;
	employee(String area,String pin,String name)
	{
		super(area,pin);
		this.name=name;
	}
	
}

public class isserialize implements Serializable {
	public static void main(String[] args)
	{
		employee e=new employee("mangalagiri","522503","rohit");
		try {
			FileOutputStream fop=new FileOutputStream("rohit.txt");
			ObjectOutputStream obj= new ObjectOutputStream(fop);
			obj.writeObject(e);
			obj.close();
			fop.close();
			System.out.println("is serialized and stored in file");

		}
		catch(Exception s)
		{
			System.out.println(s);
		}
		
	}

}
