import java.util.ArrayList;
import java.util.List;
 
public class Count3 {
 
    public static void main(String[] args) {
 
        // list of String elements
        List<String> Name = new ArrayList<>();
        Name.add("Archana");
        Name.add("Akhila");
        Name.add("Sandeep");
        Name.add("Aradhya");
        Name.add("Akshay");
        Name.add("Sai");
        Name.add("Rohith");
        Name.add("Ravi");
        Name.add("Sunitha");
        Name.add("Pravalika");
        Name.add("James");
 
        // get count for companies starting with alphabet 'a'
        long count = Name
                .stream()
                .filter(Names -> Names.startsWith("A"))
                .count();
 
        // print to console
        System.out.println("count for Name "
                + "starting with alphabet 'A' = " + count);
    }
}