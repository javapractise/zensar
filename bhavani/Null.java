 import java.io.*;
 
class Null
{
    public static void main (String[] args)
    {
       
        String ptr = null;
        try
        {
           
            if (ptr.equals("null"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
}