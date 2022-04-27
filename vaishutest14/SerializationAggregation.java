import java.io.Serializable;  


public class SerializationAggregation implements Serializable{  
 int id;  
 String name;  
 Address address;//HAS-A  
 public  SerializationAggregation(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
} 