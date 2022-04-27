package Training;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class HasA {

	public static void main(String[] args) {
		 try{     
			 Student s=new Student(12,"bhavani");      
			  FileOutputStream fout=new FileOutputStream("f.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(s);    
			  out.flush();     
			  out.close();    
			  System.out.println("success");    
			  }
			catch(Exception e)
			    {
			   System.out.println(e);
			     }    
			 try
			{
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
			Student s=(Student)in.readObject();
			System.out.println(s.id+""+s.name);
			in.close();
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
			}
			}
			  
class Address
{
String addressLine,city,state;
public Address(String addressLine,String city,String state)
{
this.addressLine=addressLine;
this.city=city;
this.state=state;
}
}
class Student implements Serializable
{
int id;
String name;
Address address;

Student(int id,String name,String addressLine,String city,String state)
{
this.name=name;
this.id=id;
}
}