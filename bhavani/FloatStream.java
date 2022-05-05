import java.io.*;
public class FloatStream {
    public static void main(String[] args) throws IOException
    {
  
       
        float[] buf = { 10, 20, 30, 40, 50 };
  
        
        FileOutputStream outputStream = new FileOutputStream("c:\\demo.txt");
  
  
        DataOutputStream dataOutputStr = new DataOutputStream(outputStream);

        for (float b : buf) {
            
            dataOutputStr.writeFloat(b);
        }
  
        dataOutputStr.flush();
  
        
        FileInputStream inputStream= new FileInputStream("c:\\demo.txt");
  
        
        DataInputStream dataInputStr= new DataInputStream(inputStream);
  
        while (dataInputStr.available() > 0) {
            
            System.out.println(
                dataInputStr.readFloat());
        }
    }
}