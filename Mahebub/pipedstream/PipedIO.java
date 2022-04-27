package pipedstream;

import java.io.*;
import java.util.*;

public class PipedIO {

	public static InputStream reverse(InputStream words) {
		PipedOutputStream pos = null;
		PipedInputStream pis = null;

		try {
			DataInputStream dis = new DataInputStream(words);
			String s;

			pos = new PipedOutputStream();
			pis = new PipedInputStream(pos);
			PrintStream ps = new PrintStream(pos);

			while ((s = dis.readLine()) != null) {
				ps.println(reverseString(s));
			}
			ps.close();
		} catch (Exception e) {
			System.out.println("String reverse: " + e);
		}
		return pis;
	}

	private static String reverseString(String s) {
		String reverse = "";

		for (int i = s.length() - 1; i >= 0; --i) {
			reverse = reverse + s.charAt(i);
		}

		return reverse;
	}

	public static InputStream sort(InputStream words) {
		PipedOutputStream pos = null;
		PipedInputStream pis = null;

		try {
			DataInputStream dis = new DataInputStream(words);
			String s;

			pos = new PipedOutputStream();
			pis = new PipedInputStream(pos);
			PrintStream ps = new PrintStream(pos);

			while ((s = dis.readLine()) != null) {
				ps.println(sortString(s));
			}
			ps.close();
		} catch (Exception e) {
			System.out.println("String sort: " + e);
		}
		return pis;
	}

	private static String sortString(String s) {
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		String s1 = Arrays.toString(ch);
		return s1;
	}

	public static void main(String[] args) throws IOException {
		DataInputStream words = new DataInputStream(new FileInputStream("words.txt"));
		InputStream randomWords = reverse(sort(reverse(words)));

		InputStreamReader isReader = new InputStreamReader(randomWords);
		BufferedReader reader = new BufferedReader(isReader);
		StringBuffer sb = new StringBuffer();
		String str;
		while ((str = reader.readLine()) != null) {
			sb.append(str);
		}
		System.out.println(sb.toString());

	}

}
