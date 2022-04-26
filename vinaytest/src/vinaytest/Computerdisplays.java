package vinaytest;
import java.util.Scanner;
public class Computerdisplays {
	public static String maxWord(String[] args) {
		byte maximumLenght = 0;
		String maximumString = "Better Luck Next Time..!";
		for(String word: args) {
			if((word.length() % 2) != 0) {
				if(word.length() > maximumLenght) {
					maximumLenght = (byte) word.length();
					maximumString= word;
				}
			}
		}
		return maximumString;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] words = new String[n];
		for(int i=0; i<n; i++) {
			words[i] = sc.next();
		}
		String result = maxWord(words);
		System.out.println(result);
		sc.close();
		
	}
}