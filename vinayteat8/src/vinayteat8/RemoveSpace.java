package vinayteat8;

import java.util.Scanner;

public class RemoveSpace {

private static Scanner sc;

public static void main(String []args)
{
    sc = new Scanner(System.in);
   System.out.println("Enter the String :");
   String str=sc.nextLine();    //Initialize the String
   
   str = str.replaceAll("\\s", ""); 
  
   System.out.println("After Removing Whitespaces the entered string is:"+str); 
}
}