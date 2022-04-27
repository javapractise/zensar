import java.io.*;

class Adress {
	
	String Name;
	int Id;

	Adress (String Name, int Id)
	{
		this.Name = Name;
		this.Id = Id;
	}
}

class Demo {
	
	public static void main(String[] args)
	{
		
		Shubh obj = new Shubh("Shubham", 1);
		System.out.println("UserName :" + obj.Name
						+ " and UserId :" + obj.Id);
	}
}
