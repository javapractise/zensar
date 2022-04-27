import java.io.*;

public class PipedInp {

	public static void main(String[] args) throws IOException {
		PipedInput obj1 =new PipedInput();
		PipedInput obj2 =new PipedInput();
		try
		{
			obj1.connect(obj2);
			obj2.write(71);
			System.out.println("using read(): " + (char)obj1.read());
			obj2.write(75);
			System.out.println("using read(): " + (char)obj1.read());
		}
		catch(IOException except) {
			except.printStackTrace();
		}
		
		
		

	}

}