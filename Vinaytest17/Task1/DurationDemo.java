import java.util.*;
import java.time.*;
class DurationDemo{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		LocalTime initialTime = LocalTime.of(7, 30, 0);
		System.out.println("Start Time :"+initialTime);

		System.out.println("Enter time in seconsds to add in time : ");
		int time = sc.nextInt();

		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(time));
		System.out.println("End Time :"+finalTime);
	}
}