package vinayteat8;

public class divide {  
	    public static void main(String[] args) {  
	    	String st ="vinaykumar";
	        String firstPart = "";
	        String secondPart = "";
	        for (int j = 0; j < st.length(); j++) {
	            if ( j < st.length() /2) {
	                firstPart += st.charAt(j);
	            }else
	                secondPart += st.charAt(j);
	       }

	        System.out.println(firstPart);
	        System.out.println(secondPart);
	    }
	    }
