package com.java.Serialization;

import java.io.Serializable;

class Address
{
	String  city;
	String State;
	public Address(String city, String state) {
		super();
		this.city = city;
		State = state;
	}
	
}
class Employee implements Serializable
{
	int id ;
	String name;
	Address address;
}


public class HasASerialization {

	public static void main(String[] args) {
		Address
	

	}

}
