package com.java.ExceptionHanding;

public class NullPointerExceptions   {

	public static void main(String[] args)   {
	
		String s =null;
		try
		{
			s.toCharArray();
			
		}catch(NullPointerException e)
		{
			e.printStackTrace();
			
		}

	}

}
