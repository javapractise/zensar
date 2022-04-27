package vinaytest14;
import java.io. * ;
public class Array {
	  int variable1,
	  variable2;
	  Array() {
	    this.variable1 = 50;
	    this.variable2 = 60;
	}
	}
	 class SerialInheritance {
	  public static void main(String[] args) throws IOException {
	  
	    try {
	      int arr[] = new int[50];
	      Array parentclassob = new Array();
	      //Creating stream and writing the object  
	      FileOutputStream fout = new FileOutputStream("file.txt");
	      ObjectOutputStream out = new ObjectOutputStream(fout);
	      out.writeObject(arr);
	      out.flush();
	      //closing the stream  
	      out.close();
	      System.out.println("This class can implement the Serializable interface!!");
	    }
	    catch(Exception e) {
	      System.out.println(e);
	    }
	  }
	}

