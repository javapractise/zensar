public class Main2 extends Thread {
   public static void main(String[] args) {
      Main t1 = new Main();
      t1.setName("thread1");
      t1.start();
      ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
      int noThreads = currentGroup.activeCount();
      Thread[] lstThreads = new Thread[noThreads];
      currentGroup.enumerate(lstThreads);
      
      for (int i = 0; i < noThreads; i++) 
System.out.println("Thread No:" + i + " = " + lstThreads[i].getName());
   }
}
