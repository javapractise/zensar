package training6;

public class Question7 {

	public static void main(String[] args) {
		
		String str = "Akhil";
		String revStr = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			revStr += str.charAt(i);
		}
		
		System.out.println(revStr);
	}


}
