import java.io.Serializable;    
class Person implements Serializable
{    
 int id;    
 String name;    
 Person(int id, String name) 
 {    
  this.id = id;    
  this.name = name;    
 }    
}    
class Student extends Person
{    
 String course;    
 int salary;    
 public Student(int id, String name, String course, int salary) 
 {    
  super(id,name);    
  this.course=course;    
  this.salary=salary;    
 }    
}    
public class SerializeISA  
{    
 public static void main(String args[])  
 {    
    try
	{    
     
  Student s1 =new Student(211,"swapna","Developer",50000);       
  FileOutputStream fout=new FileOutputStream("c:myfile.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);    
  out.writeObject(s1);    
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
   
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:myfile.txt"));    
  Student s=(Student)in.readObject();    
   
  System.out.println(s.id+" "+s.name+" "+s.course+" "+s.salary);        
  in.close();    
  }catch(Exception e)
  {
  System.out.println(e);
  }    
 }    
}  