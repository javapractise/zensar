import java.io. * ;
class ParentClass {
	int variable1,variable2;
 	ParentClass() {
    		this.a = 50;
    		this.b = 60;
	}
}
public class SerializationInheritance {
	public static void main(String[] args) throws IOException {
  		try {
      			int arr[] = new int[50];
      			ParentClass pcobj = new ParentClass();
      //Creating stream and writing the object  
      			FileOutputStream fout = new FileOutputStream("file.txt");
      			ObjectOutputStream out = new ObjectOutputStream(fout);
      			out.writeObject(arr);
      			out.flush();
      //closing the stream  
      			out.close();
      			System.out.println("This class can implement the Serializable interface!!");
    		}catch(Exception e) {
      			System.out.println(e);
    		}
  	}
}