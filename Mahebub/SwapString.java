package stirngpractice;

public class SwapString {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Programming";
		System.out.println("Strings before swapping: s1 = "+s1+" s2 = "+s2);
		s1 = s1 + s2;
    
        s2 = s1.substring(0,s1.length()-s2.length());
         
        s1 = s1.substring(s2.length());
          
        System.out.println("Strings after swapping: s1 = "+s1+ " s2 = "+s2);
	}

}
