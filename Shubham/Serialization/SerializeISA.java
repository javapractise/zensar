import java.io.*;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Person implements Serializable{    
 	int Id;    
  	String Name;
    
 	Person(int Id, String Name) {    
  		this.Id = Id;    
  		this.Name = Name;    
 	}    
}    

class Student extends Person{    
	String course;    
 	int fee;    

	public Student(int Id, String Name, String course, int fee) {    
  	        super(id,name);    
  		this.course=course;    
  		this.fee=fee;    
 	}    
}

public class SerializeISA  
{    
 	public static void main(String args[])  
 	{    
    	try{    
  	    	Student s1 = new Student(123,"Shubham","Engineering"80000);    
      
  		FileOutputStream fout=new FileOutputStream("f.txt");    
  		ObjectOutputStream out=new ObjectOutputStream(fout);    
  		out.writeObject(s1);    
  		out.flush();    
      
  		out.close();    
  		System.out.println("success");    
  	  }catch(Exception e)
	  {
		System.out.println(e);
	  }    
  	try{    						    
  		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));    
  		Student s = (Student)in.readObject();    
      
  		System.out.println(s.Id+" "+s.Name+" "+s.course+" "+s.fee);    
      
  		in.close();    
  	    }catch(Exception e)
	    {
		System.out.println(e);
	     }    
 	}    
}  