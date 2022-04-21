import java.util.*;

class RectRect {
    int lenght;
    int breath;

    RectRect(int l, int b) {
        this.lenght = l;
        this.breath = b;
    }

    public int area()
    {
        return lenght * breath;
    }
}

 public class Rectangle{
    public static void main(String[] args) {
        RectRect obj = new RectRect(4,5);
        RectRect obj1 = new RectRect(5,8);

        System.out.println(obj.area());
        System.out.println(obj1.area());
}
}