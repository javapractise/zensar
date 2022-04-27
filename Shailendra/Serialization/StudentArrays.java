package com.java.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class StudentArrays implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4892573256606266615L;
	String name;
	String city;

	public StudentArrays(String name, String city) {
		super();

		this.name = name;
		this.city = city;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<StudentArrays> list = new ArrayList<>();
		list.add(new StudentArrays("Shail", "pune"));
		list.add(new StudentArrays("raj", "indore"));

		list.add(new StudentArrays("rohit", "pune"));

		FileOutputStream fileOutputStream = new FileOutputStream("file");
		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

		outputStream.writeObject(list);
		
		
		
		
		FileInputStream fileInputStream =new FileInputStream("file");
		ObjectInputStream inputStream =new ObjectInputStream(fileInputStream);
		
		
		
		list = (ArrayList<StudentArrays>) inputStream.readObject();
		
		inputStream.close();
		fileInputStream.close();
		
		for(StudentArrays students :list)
		{
			System.out.println(students);
			
		}

	}

}
