package awesome.lld.fundamentals.concurrency.thread;

/**
 * The MyRunnable class implements the Runnable interface to create a new thread.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Code that will run in the new thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start(); // Start the new thread
    }
}
