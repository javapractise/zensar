import java.io.*;
import java.io.Serializable;

class Student implements Serializable{  
	 int Id;
  
	 String Name;
  
	 static String School = "Goverment School";

	 public void SerializationAggregation(int Id, String Name) {  
	  this.Id = Id;
          this.Name = Name;  
	 }  
}