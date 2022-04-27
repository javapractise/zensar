import java.io.*;

class address implements Serializable{
	String address;
	String lane;
	public address(String address,String lane)
	{
		this.address=address;
		this.lane=lane;
	}
}
public class student implements Serializable {
		address add;
		String name;
		int age;
		public student(String name,int age)
		{
			this.name=name;
			this.age=age;
		}
}
public class hasserialize implements Serializable {
	public static void main(String[] args)
	{
		student e=new student("mangalagiri",23);
		try {
			FileOutputStream fop=new FileOutputStream("rohit.txt");
			ObjectOutputStream obj= new ObjectOutputStream(fop);
			obj.writeObject(e);
			obj.close();
			fop.close();
		}
		catch(Exception s)
		{
			System.out.println("Exception arrised");
		}
		
	}