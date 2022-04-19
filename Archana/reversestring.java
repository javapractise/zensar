package Practice;

public class ReverseString {
	public static void main(String args[]){
		String s="Zensar";
		String a="";
		for(int i=s.length()-1;i>=0;i--){
			a=a+s.charAt(i);
		}
		System.out.println("The reverse string is:"+a);
	}
}
