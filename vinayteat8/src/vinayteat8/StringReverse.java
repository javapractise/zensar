package vinayteat8;
import java.util.Scanner;
public class StringReverse {
   private static Scanner sc;
public static String reverseString(String str){
      if(str.isEmpty()){
         return str;
      }else{
         return reverseString(str.substring(1))+str.charAt(0);
      }
   }
   public static void main(String[] args) {
      sc = new Scanner(System.in);
      System.out.println("Enter a String value: ");
      String str = sc.next();
      String result = StringReverse.reverseString(str);
      System.out.println(result);
   }
}