import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
public class WritingFile {


  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("file.txt");
      myWriter.write("Welcome to this file!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}