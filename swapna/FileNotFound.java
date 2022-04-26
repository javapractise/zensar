 
public class FileNotFound
{
  public static void main(String[] args) 
  {
         
    
    FileReader reader = new FileReader("myfile.txt");
    BufferedReader br = new BufferedReader(reader);
    String data =null;
    while ((data = br.readLine()) != null) 
    {
        System.out.println(data);
    }
      
   
    br.close();
  }
}