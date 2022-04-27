public class MyRunnableMain {

    public static void main(String[] args) {
        MyRunnableMain mr = new MyRunnableMain();

        Thread thread = New Thread(mr);

        thread.start();

        try {
            Thread.sleep(10L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mr.doStop();
    }
}