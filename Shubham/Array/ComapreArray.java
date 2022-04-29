import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ComapreArray
public static void main(String args[])  
{  
  
ArrayList<String> firstList=new ArrayList<String>();  
 
firstList.add("Apple");  
firstList.add("Pears");  
firstList.add("Guava");  
firstList.add("Mango");  
System.out.println(firstList);  
    
List<String> secondList=new ArrayList<String>();  
  
secondList.add("Apple");  
secondList.add("Pears");  
secondList.add("Guava");  
secondList.add("Mango");  
System.out.println(secondList);  
  
boolean boolval = firstList.equals(secondList); //returns true because lists are equal  
System.out.println(boolval);  
  
secondList.add("Papaya");  
  
boolean bool = firstList.equals(secondList); //returns false because lists are not equal   
System.out.println(bool);  
}  
}  