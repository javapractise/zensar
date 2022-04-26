package com.java.practice.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFIle extends FileReader {

	public ReadFIle(File file) throws FileNotFoundException {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		
		FileReader readFile =new FileReader("D:\\\\IOjava.txt");
		BufferedReader br =new BufferedReader(readFile);
	int i;
	while((i=br.read())!= -1)
	{
		System.out.print((char)i);
	}
	br.close();	
	readFile.close();
		
	
		
	}

}
