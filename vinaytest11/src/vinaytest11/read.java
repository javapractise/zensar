package vinaytest11;
import java.io.File;
import java.util.Scanner;

public class read {
private Scanner x;
public void openFile() {
	try {
		x=new Scanner(new File("info.txt"));
	}
	catch (Exception e) {
		System.out.printf("could not find file");
	}
}
public void readFile() {
	while(x.hasNext()){
		String a=x.next();
		String b=x.next();
		String c=x.next();
		System.out.printf("%s %s %s\n",a,b,c);
		
	}
}
public void closefile() {
	x.close();
	}
}