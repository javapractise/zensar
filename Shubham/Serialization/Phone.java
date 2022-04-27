import java.io.*;

class Phone {

	private String phoneName;

	public void setPhoneName(String phoneName)
	{
		this.phoneName = phoneName;
	}

	public String getPhoneName()
	{
		return this.phoneName + " is a Phone";
	}
}

class SmartPhone extends Phone {
	public static void main(String gg[])
	{
		Phone phone = new SmartPhone();
		
		System.out.println("Phone name is SmartPhone");
		device.setDeviceName("SmartPhone");
		
		System.out.println(phone.getPhoneName());
	}
}

