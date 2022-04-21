import java.util.*;

class Triangle{

    int Perimeter_Calculator (int a, int b, int c){ 
	int perimeter = 3 + 4 + 5;
	return perimeter;
}

     int Area_Calculator (int l, int h){
	 int Area = 3 * 4;
	 return Area;
   }
}

public class Main {

public static void main (String[]args)
{

	Triangle object = new Triangle ();

	char Exit_Status;

   	do {
	Scanner input = new Scanner (System.in);
	System.out.println ("Enter A for Area || Enter P 		for Perimeter");

	char User_choice = input.next ().charAt (0);
	if (User_choice == 'P')
	{
	System.out.print ("a> ");
	int a = input.nextInt ();
	System.out.print ("b> ");
	int b = input.nextInt ();
	System.out.print ("c> ");
	int c = input.nextInt ();
	int Perimeter_Find = object.Perimeter_Calculator 		(3, 4, 5);
	System.out.println (Perimeter_Find);
    }

	else if (User_choice == 'A'){
		System.out.print ("Length> ");
		int l = input.nextInt ();
		System.out.println ("Height> ");
		int h = input.nextInt ();
		int Area_Find = object.Area_Calculator (l, 		h);
		System.out.println (Area_Find);
	}

	else
	{
		System.out.println ("Enter P || A only"); 	}

		System.out.println ("Do you want to 		Continue Enter Y or N");
		Exit_Status = input.next ().charAt (0);
	}

	while (Exit_Status == 'Y');
	}
}