package vinaytest11;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileNotFound {
public static void main(String[] args) {
File fileObj = new File("D:/JavaPractice.txt");
FileInputStream fISObj = null;
try{
fISObj = new FileInputStream(fileObj);
while (fISObj.read()!=-1){
System.out.println(fISObj.read());
}
}catch (FileNotFoundException e){
e.printStackTrace();
}catch (IOException e){
e.printStackTrace();
}
}
}