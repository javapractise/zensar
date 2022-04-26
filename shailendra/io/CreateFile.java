package com.java.practice.io;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
    File objFile =new File("D:\\IOjava.txt");
    objFile.createNewFile();
    
    System.out.println("file create");
    if(objFile.exists())
    {
    	System.out.println("File exists");
    	//Information of file
    	System.out.println("Information");
    	System.out.println("Name "+objFile.getName());
    	System.out.println("Path "+objFile.getPath());
    	   System.out.println("Writeable: " + objFile.canWrite());
    	      System.out.println("Readable " + objFile.canRead());
    }
    else
    {
    	System.out.println("file does'nt exist");
    }
	
    
	}

}
