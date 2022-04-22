public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String sentence = "Zensar Technologies";
		System.out.println("Original sentence:" + sentence);
		sentence = sentence.replaceAll("\\s+", "");
		System.out.println("After replacing:" + sentence);
		}
}