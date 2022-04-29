package javaprogram;
import java.io.*;

public class PipedOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PipedInputStream a_input =new PipedInputStream();
		PipedOutputStream a_output =new PipedOutputStream();
		a_input.connect(a_output);
		byte[] buffer= {'J','A','V','A'};
		a_output.write(buffer,0,4);
		int a=5;
		System.out.print("use of write : ");
		while(a>0) {
			System.out.print(" " + (char) a_input.read());
		}


	}

}