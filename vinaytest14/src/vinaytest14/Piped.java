package vinaytest14;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
public class Piped {
	public static void main(String[] args) throws IOException {
		PipedInputStream a_input =new PipedInputStream();
		PipedOutputStream a_output =new PipedOutputStream();
		try
		{
			a_input.connect(a_output);
			a_output.write(71);
			System.out.println("using read(): " + (char)a_input.read());
			a_output.write(75);
			System.out.println("using read(): " + (char)a_input.read());
		}
		catch(IOException except) {
			except.printStackTrace();
		}
		
	}

}