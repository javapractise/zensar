import java.io.*;

class Address implements Serializable{
	String city ;

	public Address(String city)
	{
		this.city = city ;
	}
}

class Person implements Serializable{
	String name;
	Address ad;

	public Person(String name)
	{
		this.name = name;
	}
}

