import java.util.Scanner;
 
public class StringSwap 
{
        public static void main (String[] args) 
        {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter First String : ");

                String str1 = sc.nextLine();

                System.out.print("Enter Second String : ");

                String str2 = sc.nextLine();

                System.out.println("nBefore Swapping :");

                System.out.println("Str1 : "+str1);

                System.out.println("Str2 : "+str2);
            
                str1=str2+str1;
                str2=str1.replace(str2,"");
                str1=str1.replace(str2,"");
                
                System.out.println("After Swapping :");
         
                System.out.println("Str1 : "+str1);

                System.out.println("Str2 : "+str2);
        }
}
