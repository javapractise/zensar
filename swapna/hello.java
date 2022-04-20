class hello{
    int length;
    int breadth;

    public hello()
    { this(10);
        int length = 0;
        int breadth = 0;

    }

    public hello(int lenght)
    {this(5,8);
        this.length = 4 ;
         breadth = 5;

    }
    public hello(int length,int breadth)
    {
        this.length = 7;
        this.breadth = 8;
    }
    public void  m1()
    {
        System.out.println(length*breadth);
    }
}
         public  class Recatangle8 {
        public static void main(String[] args) {
        hello obj = new hello();
        obj.m1();
        hello obj1= new hello(10);
        obj1.m1();
        hello obj2 = new hello(12,2);
        obj2.m1();


    }
}