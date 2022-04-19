import java.io.*;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        
        int[] arr = {25, 86, 41, 97, 22, 34};
         
        int largest = Integer.MIN_VALUE;
         
        int index = 0;
        while( index < arr.length ) {
            if( largest < arr[index] ) {
                //update largest
                largest = arr[index];
            }
            index++;
        }
         
        System.out.println("The largest number is : "+ largest);
    }
}