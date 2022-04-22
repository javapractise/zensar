package vinayteat8;

public class IgnoreCases {
	    public static void main(String[] args) {
	        String str1 = "Vinay";
	        String str2 = "vinay";
	        if (str1.equalsIgnoreCase(str2)) {
	            System.out.println("str1 and str2 are equal");
	        }
	        else {
	            System.out.println("str1 and str2 are not equal");
	        }
	    }
	}