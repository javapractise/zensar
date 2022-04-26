import java.io.File;  
import java.io.IOException;
public class CreatingFile {


  public static void main(String[] args) {
    try {
      File F = new File("file.txt");
      if (F.createNewFile()) {
        System.out.println("File created: " + F.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}