import java.io.*;
 
class ArrayIndex
{
    public static void main (String[] args)
    {
       
       
        try
        {
           
           int i[]=new int[12];
	   i[13]=3;	
               
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("ArrayindexoutofboundsException  ");
        }
    }
}