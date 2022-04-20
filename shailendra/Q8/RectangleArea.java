package com.java.inherience;


class Rectangle8 {
    int lenght;
    int breath;

    Rectangle8(int l, int b) {
        this.lenght = l;
        this.breath = b;
    }

    public int area()
    {
        return lenght * breath;
    }
}

public class RectangleArea {

	public static void main(String[] args) {
	
		Rectangle8 rectangle1 = new Rectangle8(4,5);
		Rectangle8 rectangle2 = new Rectangle8(5,8);

	        System.out.println(rectangle1.area());
	        System.out.println(rectangle2.area());

	}

}
