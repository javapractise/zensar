import java.io.*;

public class Pipe{
	public static void main(String[] args) throws IOException
    	{
        		PipedInputStream ip = new PipedInputStream();
        		PipedOutputStream op = new PipedOutputStream();
        		try
        		{	
           
          	 	 	ip.connect(op);
            
            			op.write(71);
            			op.write(69);
            			op.write(83);
 

 
            			int i = 5;
            			while(i > 0)
            			{
                			System.out.print(" " + (char) ip.read());
                			i--;
            			}
 
            
            			// closing the output stream
            			op.close();
 
       		}
        		catch (Exception e)
        		{
            			e.printStackTrace();
        		}
    	}
}