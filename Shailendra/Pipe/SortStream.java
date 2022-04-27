package com.java.pipestream;

import java.io.*;
import java.util.*;

public class SortStream {

	public static InputStream reverse(InputStream words) {
		PipedOutputStream outputStream = null;
		PipedInputStream inputStream = null;

		try {
			DataInputStream dataInputStream = new DataInputStream(words);
			String s;

			outputStream = new PipedOutputStream();
			inputStream = new PipedInputStream(outputStream);
			PrintStream printStream = new PrintStream(outputStream);

			while ((s = dataInputStream.readLine()) != null) {
				printStream.println(reverseString(s));
			}
			printStream.close();
		} catch (Exception e) {
			System.out.println("String reverse: " + e);
		}
		return inputStream;
	}

	private static StringBuilder reverseString(String s) {
		StringBuilder  reverse =new StringBuilder( "");
   StringBuilder sb =new StringBuilder(s);
   reverse =   sb.reverse();
		

		return reverse;
	}

	public static InputStream sort(InputStream words) {
		PipedOutputStream outputStream = null;
		PipedInputStream inputStream = null;

		try {
			DataInputStream dataInputStream = new DataInputStream(words);
			String s;

			outputStream = new PipedOutputStream();
			inputStream = new PipedInputStream(outputStream);
			PrintStream printStream = new PrintStream(outputStream);

			while ((s = dataInputStream.readLine()) != null) {
				printStream.println(sortString(s));
			}
			printStream.close();
		} catch (Exception e) {
			System.out.println("String sort: " + e);
		}
		return inputStream;
	}

	private static String sortString(String s) {
		String str =new String(s);
	
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		String s1 = Arrays.toString(ch);
		return s1;
	}

	public static void main(String[] args) throws IOException {
		DataInputStream words = new DataInputStream(new FileInputStream("D://words.txt"));
		InputStream wordsfile = reverse(sort(reverse(words)));

		InputStreamReader isReader = new InputStreamReader(wordsfile);
		BufferedReader reader = new BufferedReader(isReader);
		StringBuffer stringBuffer = new StringBuffer();
		String str;
		while ((str = reader.readLine()) != null) {
			stringBuffer.append(str);
		}
		System.out.println(stringBuffer.toString());

	}

}