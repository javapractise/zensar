public class ReplaceSpace {

	public static void main(String[] args) {
		
		String string = "Zensar Technologies";
		char ch ='_';
		System.out.println("String before replacing space");
		System.out.println(string);
		string = string.replace(' ', ch);
		System.out.println("String after replacing space");
		
		System.out.println(string);
	}

}