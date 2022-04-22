public class Swap {

	public static void main(String[] args) {
		
		String s1="Apple";
		String s2="Banana";
		System.out.println(String.format("Before Swap s1 =%s and %s2 = %s.\n",s1, s2));
		s1 = s1 + s2;
		s2 = s1.substring(0,s1.length()- s2.length());
		s1 = s1.substring(s2.length());
		System.out.println(String.format("After Swap s1 =%s and %s2 = %s.\n",s1, s2));
		}
    }