package practice;

class IterateArrayList {
  public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<String>();
    names.add("revathi");
    names.add("yaseswini");
    names.add("akhila");

    names.forEach((n) -> {
      System.out.println(n + ", ");
    });
  }
} 