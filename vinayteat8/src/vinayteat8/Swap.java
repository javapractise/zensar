package vinayteat8;

public class Swap {
	
	    public static void main(String[] args) {
	        String a = "vinay";
			String b = "kumar";
	        System.out.println("Way 1 Before swaping using temp variable a = " + a + ", b = " + b);
	        String temp;
	        temp = a;
	        a = b;
	        b = temp;
	      System.out.println("After swaping using temp variable a = " + a + ", b = " + b);
	    }
	}