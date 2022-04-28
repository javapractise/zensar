package com.java.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientKeyWord implements Serializable {

	int id;
	String name;
	transient int age;// it is now not serilized

	public TransientKeyWord(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public static void main(String args[]) throws Exception {
		TransientKeyWord transientKeyWord = new TransientKeyWord(6767, "sinu", 22);// creating object
		// writing object into file
		FileOutputStream fileOutputStream = new FileOutputStream("words.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
		out.writeObject(transientKeyWord);
		out.flush();
		out.close();
		fileOutputStream.close();
		System.out.println("success");
	}
}
