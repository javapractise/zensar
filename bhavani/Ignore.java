public class Ignore {

public static void main(String[] args)
    {
        String c1= "jinde";
        String c2 = "bhvaani";
        String c3 = "zensar";

        
boolean equals1 = c1.equalsIgnoreCase(c2);
boolean equals2 = c1.equalsIgnoreCase(c3);
System.out.println();
        
System.out.println("\"" + c1 + "\" equals \"" + c2 + "\"? " + equals1);
System.out.println("\"" + c1 + "\" equals \"" + c3 + "\"? " + equals2);
System.out.println();
    }
}
