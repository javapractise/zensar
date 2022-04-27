

class Employee implements Serializable{  
 transient int id;  
 String name;  
 public Student(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  

}  
class Transient{    
 public static void main(String args[]){    
  try{     
   Employee s=new Employee(12,"bhavani");      
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
  
