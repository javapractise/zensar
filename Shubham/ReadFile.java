import java.util.*; 
import java.io.File; 
import java.util.Scanner ;

public class ReadFile {

	public static void main(String[] args){
 
		File file = new File("readme.txt"); 
		Scanner s = null;

		try{ 
			System.out.println("...Read the contents of the file..."); 
			s = new Scanner(file);

			while(s.hasNextLine()){ 
				String line = s.nextLine();  	
				System.out.println(line);       
			}

		}catch(Exception ex){ 
			System.out.println("Message:" + ex.getMessage()); 
		}finally
		{  
			try{ 
				if(s!=null) 
					s.close(); 
			}catch(Exception ex2)
			{ 
				System.out.println("Message 2: "  + ex2.getMessage()); 
			} 
		} 
	} 
}