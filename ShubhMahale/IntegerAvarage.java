import java.util.*;

public class IntegerAvarage{
    public static void main(String[] args) {
        int sum = 0, i, n;

	Scanner sc = new Scanner(System.in);

        for(i = 0; i < 10; i++){
        System.out.println("Enter number");
  	n = sc.nextInt();
        sum = sum + n;
    }

    System.out.println("Sum is: " +sum);
   }
 }
}