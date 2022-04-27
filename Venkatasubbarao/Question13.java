package training6;


public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "AkhilNaidu";
		int n = 5;
		int len = str.length();
		int parts = len/5;

		for(int i=0; i<len; i++) {
			if(i % parts == 0) {
				System.out.println();
			}
			System.out.println(str.charAt(i));
		}

	}

}