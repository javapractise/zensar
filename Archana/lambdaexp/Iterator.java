class Iterator
 {
  public static void main(String[] args)
  {
    
    ArrayList<String> languages = new ArrayList<>();
    languages.add("java");
    languages.add("c++");
    languages.add("JavaScript");
    System.out.print("ArrayList: ");
    
    languages.forEach((e) -> {
      System.out.print(e + ", ");
    });
  }
}