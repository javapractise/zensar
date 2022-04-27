package Threaddemo;


class ThreadDemo
{
     public static void main(String[] args)
     {
          Thread1 t1 = new Thread1("Running Thread1....");
          Thread1 t2 = new Thread1("Running Thread2....");
          t1.start();
          t2.start();
     }
}