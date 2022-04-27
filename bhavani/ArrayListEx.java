import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
  
public class ArrayListEx {
  

    static void serializeArrayList()
    {
  
       
        ArrayList<String> namesList= new ArrayList<String>();
        namesList.add("Geeks");
        namesList.add("for");
        namesList.add("Geeks");
  
        try {
            
            FileOutputStream fos= new FileOutputStream("namesListData");
  
           
            ObjectOutputStream oos = new ObjectOutputStream(fos);
 
            oos.writeObject(namesList);
  
            
            oos.close();
  
          
            fos.close();
  
            System.out.println("namesList serialized");
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
  
   
    public static void main(String[] args) throws Exception
    {
        
        serializeArrayList();
    }
}
