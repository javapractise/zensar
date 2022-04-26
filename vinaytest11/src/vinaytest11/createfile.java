package vinaytest11;
import java.io.*;
import java.util.*;
public class createfile {
	private Formatter x;
	public void openFile() {
		try {
			x=new Formatter("info.txt");
		}
		catch(Exception e) {
			System.out.println("you have a error");
		}
	}
	public void addRecords() {
		x.format("%s,%s,%s", "Vinay","Kumar","Age21");
		x.format("%s,%s,%s", "honey","m","Age20");
		x.format("%s,%s,%s", "deepu","a","Age22");
		x.format("%s,%s,%s", "teja","nikhil","Age21");
	}
public void closefile() {
	x.close();
}
}
