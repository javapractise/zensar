import java.io.Serializable;  
 class Pen implements Serializable{    
 String name; 
double cost; 
 Pen(String name,double cost) {  
  this.name=name;
  this.cost=cost; 
 }  
}   
class Student extends pen
{
int id;
String course;
Student(String name,double cost,int id,String course)
{
super(name,cost);
this.course=course;
this.id=id;
}
}
class Serial{    
 public static void main(String args[]){    
  try{     
   Student s=new Student("bhavani",12.0,211,"ECE");      
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
System.out.println(s.id+""+s.name+""+s.course+""+s.cost);
in.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
  
