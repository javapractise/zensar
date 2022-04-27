import java.io.*;
public class Sort1
{
    public static void main(String[] args) throws IOException
    {
        PipedInputStream geek_input = new PipedInputStream();
        PipedOutputStream geek_output = new PipedOutputStream();
 
        
        geek_input.connect(geek_output);
 
        byte[] buffer = {'J', 'A', 'V', 'A'};
 
        // Use of write(byte[] buffer, int offset, int maxlen)
        geek_output.write(buffer, 0, 3);
        int a = 5;
        System.out.print("Use of write(buffer, offset, maxlen) : ");
        while(a>0)
        {
            System.out.print(" " + (char) geek_input.read());
        }
    }
}