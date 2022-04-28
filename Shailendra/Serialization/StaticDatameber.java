package com.java.Serialization;



import java.io.Serializable;

public class StaticDatameber implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int id ;
String name;
static String country;//it wont serialized 

}