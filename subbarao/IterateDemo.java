import java.util.ArrayList;

class IterateDemo {
  public static void main(String[] args) {

    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("Python");
    languages.add(".net");
    System.out.print("ArrayList: ");

    languages.forEach((e) -> {
      System.out.print(e + "  , ");
    });
  }
} 