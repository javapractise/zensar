import java.util.*;  


public class CompareListArray
{  
public static void main(String args[])  
{  

ArrayList<String> firstList=new ArrayList<String>();  

firstList.add("Apple");  
firstList.add("Grapes");  
firstList.add("Banana");  
firstList.add("Mango");
firstList.add("charries");  
System.out.println(firstList);  

List<String> secondList=new ArrayList<String>();  

secondList.add("Apple");  
secondList.add("Grapes");  
secondList.add("Banana");  
secondList.add("Mango");  
System.out.println(secondList);  

boolean boolval = firstList.equals(secondList); 

secondList.add("charries");  

boolean bool = firstList.equals(secondList);    
System.out.println(bool);  
}  
} 