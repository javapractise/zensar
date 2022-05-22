import java.util.*;

public class ListIterate {
   public static void main(String[] argv) {
      List<String> countryNames = new ArrayList<String>();
      countryNames.add("India");
      countryNames.add("England");
      countryNames.add("Australia");
      countryNames.add("Newzealand");
      countryNames.add("South Africa");

      countryNames.forEach(name -> System.out.println(name));
   }
}