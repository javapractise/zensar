class Triangle{
	
	public static void main(String[] args)
	{
		int side1 = 3;
		int side2 = 4;
		int side3 = 5;
		
		System.out.println("Perimeter of Triangle :"+ (side1+side2+side3));	

		int semi = (side1+side2+side3)/2;
		double area = Math.sqrt(semi*(semi-side1)*(semi-side2)*(semi-side3));
		System.out.println("Area of Triangle :"+area);
	}
}