package vinayteat8;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	    private static Scanner scanner;

		public static void main(String args[]) {
	        String str1, str2;
	        scanner = new Scanner(System.in);
	 
	        System.out.println("Enter First String");
	        str1 = scanner.nextLine();
	 
	        System.out.println("Enter Second String");
	        str2 = scanner.nextLine();
	 
	        char[] array1 = str1.toCharArray();
	        char[] array2 = str2.toCharArray();
	 
	        Arrays.sort(array1);
	        Arrays.sort(array2);
	 
	        if (String.valueOf(array1).equals(String.valueOf(array2))) {
	            System.out.println("Anagram String");
	        } else {
	            System.out.println("Not Anagram String");
	        }
	    }
	}