package vinaytest10;

public class Nested {
  interface InnerInterface {
    void myMethod();
  }
}
class NestedInterface implements Nested.InnerInterface {
  public void myMethod() {
    System.out.println("This is the vinay nested interface method");
  }
  public static void main(String args[]) {
    NestedInterface object = new NestedInterface();
    object.myMethod();
  }
}