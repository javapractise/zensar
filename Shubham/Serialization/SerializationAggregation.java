import java.io.*;
import java.io.Serializable;

public class SerializationAggregation implements Serializable{  
 	 int Id;  
	 String Name;  
  	 Address address;
 
	public  SerializationAggregation(int Id, String Name) {  
  		this.Id = Id;  
  		this.Name = Name;  
	 }  
} 