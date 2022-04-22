import java.util.*;
public class RemoveAll
{
     public static void main(String []args)
     {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();    
        
        str = str.replaceAll("\\s", ""); 
       
        System.out.println("After Removing Whitespaces the entered string is:"+str); 
     }
}