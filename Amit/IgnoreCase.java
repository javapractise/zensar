// Ignore cases

class IgnoreCase{
	public static void main(String[] args)
	{
		String str1 = "Zensar";
		String str2 = "zensar";
		String str3 = "hello world";
		System.out.println("Checking Strings "+str1+" and "+str2);
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println("Checking Strings "+str2+" and "+str3);
		System.out.println(str2.equalsIgnoreCase(str3));
	}
}