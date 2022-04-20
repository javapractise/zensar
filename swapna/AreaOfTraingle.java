public class AreaOfTriangle {
	
	public static void main (String args[])
	{
		 double a,b,c, Perimeter, s,Area;
		 sc = new Scanner(System.in);
		 System.out.println("\n please enter three sides of traingle:");
		 a = sc.nextDouble();
		 b = sc.nextDouble();
		 c = sc.nextDouble();
		
		Perimeter = a + b + c;
		s = (a + b + c)/2; 
		Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.format("The Perimeter of Triangle = %.2f\n", Perimeter);
		System.out.format("The Semi Perimeter of Triangle = %.2f\n",s);
		System.out.format("The Area of triangle = %.2f\n",Area);
	}
}