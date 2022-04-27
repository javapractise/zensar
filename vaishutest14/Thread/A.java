package Threaddemo;
public class A extends Thread {
  public static void main(String[] args) {
    A thread = new A();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}