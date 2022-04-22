package project1;

public class Ignorecases {



public static void main(String[] args)
    {
        String columnist1 = "vaishnavi";
        String columnist2 = "vaishnavi";
        String columnist3 = "stephenedwin king";

       
boolean equals1 = columnist1.equalsIgnoreCase(columnist2);
boolean equals2 = columnist1.equalsIgnoreCase(columnist3);
System.out.println();
      
System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist2 + "\"? " + equals1);
System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist3 + "\"? " + equals2);
System.out.println();
    }
}