package javaprogram;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "how are you doing in Java";
		System.out.println("Original sentence:" + sentence);
		sentence = sentence.replaceAll("\\s+", "");
		System.out.println("After replacing:" + sentence);
		}
}
