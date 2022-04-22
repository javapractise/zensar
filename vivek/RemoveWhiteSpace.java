public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String sentence = "how are you doing in Java";
		System.out.println("Original sentence:" + sentence);
		sentence = sentence.replaceAll("\\s+", "");
		System.out.println("After replacing:" + sentence);
		}
}
