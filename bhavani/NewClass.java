import java.io.*;
public class NewClass
{
    public static void main(String[] args) throws IOException
    {
        PipedInputStream connect_input = new PipedInputStream();
        PipedOutputStream connect_output = new PipedOutputStream();
        try
        {
            
            connect_input.connect(connect_output);
  
            
            connect_output.write(71);
            System.out.println("using read() : " + (char)connect_input.read());
            connect_output.write(69);
            System.out.println("using read() : " + (char)connect_input.read());
            connect_output.write(75);
            System.out.println("using read() : " + (char)connect_input.read());
  
        }
        catch (IOException except)
        {
            except.printStackTrace();
        }
    }
}
