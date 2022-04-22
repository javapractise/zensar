public class String {

	public static void main(String[] args) {

		String str = "Subbarao";
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
