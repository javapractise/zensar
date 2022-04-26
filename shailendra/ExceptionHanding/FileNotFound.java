package com.java.ExceptionHanding;

import java.io.File;
import java.io.FileNotFoundException;

public class FileNotFound {

	public static void main(String[] args) throws FileNotFoundException {
		File file =new File("D://file.txt");
		file.exists();

	}

}
