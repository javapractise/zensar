import java.io.*;
public class Piped
{
    public static void main(String[] args) throws IOException
    {
        PipedInputStream g_input = new PipedInputStream();
        PipedOutputStream g_output = new PipedOutputStream();
        try
        {
           
            g_input.connect(geek_output);
 
            
            g_output.write(71);
            g_output.write(69);
            g_output.write(69);
            g_output.write(75);
            g_output.write(83);
 
            // Use of flush() method :
            geek_output.flush();
            System.out.println("Use of flush() method : ");
 
            int i = 5;
            while(i > 0)
            {
                System.out.print(" " + (char) g_input.read());
                i--;
            }
 
            
            System.out.println("\nClosing the Output stream");
            geek_output.close();
 
        }
        catch (IOException except)
        {
            except.printStackTrace();
        }
    }
}
