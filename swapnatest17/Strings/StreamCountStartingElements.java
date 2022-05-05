import java.util.ArrayList;
import java.util.List;
 
public class StreamCountStartingElements 
{
 
    public static void main(String[] args) 
	{
 
        
        List<String> companies = new ArrayList<>();
        companies.add("Accenture");
        companies.add("Anasol");
        companies.add("Amdoc");
        companies.add("ADP");
        companies.add("Amazon");
		companies.add("Atos");
        long count = companies
                .stream()
                .filter(company -> company.startsWith("A"))
                .count();
 
        
        System.out.println("count for companies "
                + "starting with alphabet 'A' = " + count);
    }
}
//
C:\Users\SC67784\repo\SAMPLE>javac StreamCountStartingElements.java

C:\Users\SC67784\repo\SAMPLE>java StreamCountStartingElements.java
count for companies starting with alphabet 'A' = 6