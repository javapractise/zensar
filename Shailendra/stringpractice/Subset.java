
public class Subset {

	public static void main(String[] args) {
	String string ="shailendr";
	
//string =string.substring(5);
System.out.println(string);

for(int i =0;i<=string.length();i++)
{
	String subset =string.substring(i);
	System.out.println(subset);
	
}

}
}
