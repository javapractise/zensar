package practice;

class IterateArrayList {
  public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<String>();
    names.add("hemanth");
    names.add("naveen");
    names.add("harsha");

    names.forEach((n) -> {
      System.out.println(n + ", ");
    });
  }
} 