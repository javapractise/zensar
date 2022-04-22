public class Swapping{
	 public static void main(String[] args) {    
       		String a = "Archana", b = "Reddy";    
        	System.out.println("Strings before swapping: " + a + " " + b);    	        	a=a+b;
         	b = a.substring(0, (a.length() - b.length()));    
          	a = a.substring(b.length());    
            	System.out.println("Strings after swapping: " + a + " " + b);    	}
}
        
    
