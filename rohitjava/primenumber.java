 class prime {
	public static void main(String[] args) {
		int num=7;
		int count=0,fact=1;
		while(fact<=num)
		{
			if(num%fact==0)
			{
				count=count+1;
				
			}
			fact=fact+1;
		}
		if(count==2)
		{
			System.out.println("given number is prime");
		}
		else
		{
			System.out.println("given number is not a prime");
		}

	}

}