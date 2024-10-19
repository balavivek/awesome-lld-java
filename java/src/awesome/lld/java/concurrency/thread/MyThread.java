package awesome.lld.java.concurrency.thread;

/**
 * The MyThread class extends the Thread class to create a new thread.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        // Code that will run in the new thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the new thread
    }
}
