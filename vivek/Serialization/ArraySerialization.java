import java.io. * ;
class ParentClass {
  int variable1,
  variable2;
  ParentClass() {
    this.variable1 = 50;
    this.variable2 = 60;
}
}
public class SerialInheritance {
  public static void main(String[] args) throws IOException {
  
    try {
      int arr[] = new int[50];
      ParentClass parentclassob = new ParentClass();
      FileOutputStream fout = new FileOutputStream("file.txt");
      ObjectOutputStream out = new ObjectOutputStream(fout);
      out.writeObject(arr);
      out.flush();
      out.close();
      System.out.println("This class can implement the Serializable interface!!");
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }
}