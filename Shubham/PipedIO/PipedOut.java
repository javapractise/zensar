import java.io.*;

public class PipedOut {

	public static void main(String[] args) throws IOException {
		
		PipedInput obj1 = new PipedInput();
		PipedInput obj2 = new PipedInput();
	
		obj1.connect(obj2);	

		byte[] buffer= {'J','A','V','A'};

		obj2.write(buffer,0,4);

		int a=5;

		System.out.print("use of write : ");

		while(a>0) {
			System.out.print(" " + (char) obj1.read());
		}		
	}
}