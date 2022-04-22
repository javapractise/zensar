// Swapping in Java

import java.util.*;
import java.util.lang; 
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Swapping {

   public static void main(String[] args) {    
        String str1 = "Java ", str2 = "Training ";    
         System.out.println("Strings before swapping: " + str1 + " " + str2);    
        
        
        str1 = str1 + str2;    
         
        str2 = str1.substring(0, (str1.length() - str2.length()));    
          
        str1 = str1.substring(str2.length());    
            
        System.out.println("Strings after swapping: " + str1 + " " + str2);    
    }    
} 