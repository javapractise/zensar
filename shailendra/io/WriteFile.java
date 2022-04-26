package com.java.practice.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) {
		try {
			File obj =new File("D:\\IOjava.txt");
		if(	obj.exists())
		{
			System.out.println("exists");
			
		}
		else
		{
			System.out.println("not exists");
		}
		FileWriter  writer =new FileWriter ("D:\\IOjava.txt");
			writer.write("from Java Program we write");
			writer.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("written");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
