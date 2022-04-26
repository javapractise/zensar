import java.io.*;
 
class Arthimetic
{
    public static void main (String[] args)
    {
       
       
        try
        {
           
           int i=10,j=0;
	   int z=i/j;
	 System.out.print("result:"+z);

               
        }
        catch(ArithmeticException e)
        {
            System.out.print("ArthimeticException Caught");
        }
    }
}