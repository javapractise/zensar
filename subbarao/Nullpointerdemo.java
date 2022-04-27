public class Nullpointerdemo {


    public static void main (String[] args)     { 

        String myStr = null; 

        try   { 
            if ("Hello".equals(myStr))      
                System.out.print("Two strings are same"); 
            else
                System.out.print("Strings are not equal");             
        } 
        catch(NullPointerException e)   { 
            System.out.print("Caught NullPointerException"); 
        } 
    } 
} 