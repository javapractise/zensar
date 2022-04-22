public class FrequencyOfCharacters {
   public static void main(String[] args) {
   
   String input_string = "this is a string programming";
      System.out.println("The string is defined as: " +input_string);
      char input_character = 'm';
      System.out.println("The character is defined as: " +input_character);
      int counter = 0;
      for(int i = 0; i < input_string.length(); i++) {
         if(input_character == input_string.charAt(i)) {
            ++counter;
         }
      }
      System.out.println("The frequency of " + input_character + " is " + counter );
   }
}