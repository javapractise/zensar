import java.io.Serializable;  
public class Address1 {
	String addressLine,city,state;    
	public Address1(String addressLine, String city, String state) {    
		this.addressLine=addressLine;    
		this.city=city;    
	  	this.state=state;    
	}    
} 
public class SerializationAggregation implements Serializable{  
	int id;  
	String name;  
	Address1 address1;//HAS-A  
	public  SerializationAggregation(int id, String name) {  
		this.id = id;  
		this.name = name;  
	}  
} 