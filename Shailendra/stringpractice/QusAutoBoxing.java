package com.java.stringpractice;

public class QusAutoBoxing {

	public static void main(String[] args) {
	int a =20;
	char c='s';
	double d=23.4353;
	float f =3.5f;
	
	Integer integer =new Integer(a);
	System.out.println(integer);
	
	Character character =new Character(c);
System.out.println(character);

Double dou =new Double(d);

System.out.println("this is Double"+dou);

Double dou1 =new Double(f);
System.out.println(dou1);



	}

}
