//getfileinfo

package filehandling;

import java.io.File;

public class getfileinfo {

	public static void main(String[] args) {

    File myfile=new File("D:hemanth.txt");
   
    if(myfile.exists())
    {
    	System.out.println(myfile.getName());
    	System.out.println(myfile.getPath());
    }

	}

}