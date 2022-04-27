class RunningThread1 extends Thread
{
      public static void main(String[] args)
      {
            System.out.println("Main methods");
            RunningThread1  obj = new RunningThread1();

            obj.setName("\nThreadName ");
            obj.start();

            ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
            int numThreads = currentGroup.activeCount();
            Thread[] lstThreads = new Thread[numThreads];
            currentGroup.enumerate(lstThreads);
            for (int i =1;i< numThreads ; i++)
            {
                  System.out.println("Number of thread: "+i + "  " + lstThreads[i].getName());
            }
            Thread currentThread = Thread.currentThread();
            System.out.println("Current running thread1: "+currentThread);
      }
} 