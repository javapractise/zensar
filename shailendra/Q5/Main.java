package com.java.inh.Q5;



import Q5.Squre;

public class Main {
	public static void main(String[] args) {
		
	
    Rectangle r=new Rectangle(10,4);
    r.area();
    r.perimeter();
    Squre s=new Squre(5);
    s.area();
    s.perimeter();
    int i,k=1;
    Squre[] a=new Squre[10];
    for(i=0;i<=10;i++){
        a[i]=new Squre(k);
        k++;
    }
    for(i=0;i<=10;i++){
        a[i].area();
        a[i].perimeter();
    }
    
	}

}