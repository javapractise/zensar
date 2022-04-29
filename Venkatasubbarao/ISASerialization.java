
package com.java.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable
{int id=1;
String name="sss";
public A(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}



}
class B extends A
{

	public B(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	int b =20;
}
public class ISASerialization {

	public static void main(String[] args) throws IOException {
		B  claasB =new B(1, "sinu");
	FileOutputStream fileOutputStream =new FileOutputStream("Inhertacne.txt");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(claasB);

		objectOutputStream.flush();
		objectOutputStream.close();
		try
		{
			ObjectInputStream stream=new ObjectInputStream(new FileInputStream("Inhertacne.txt"));  
			B b =(B) stream.readObject();	
			System.out.println(b.id+" "+b.name);
		}catch(Exception e)
		{

		}


	}

}