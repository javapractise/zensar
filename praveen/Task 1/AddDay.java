import java.util.Scanner;
	import java.time.*;
	import java.time.temporal.Temporal;

	public class AddDay {
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Today's Date : "+LocalDate.now());
			System.out.println("Enter the no. of days to add in above date :");
			int day = sc.nextInt();
			Period pd = Period.ofDays(day);
			Temporal temp = pd.addTo(LocalDate.now());
			System.out.println("Updated Day : "+temp);
		}
	}