package awesome.lld.java.concurrency.volatilekeyword;


public class VolatileExampleApp {

    public static void main(String[] args) {
    // Create a new Counter instance
    Counter counter = new Counter();

    // Create threads to increment the counter
    Thread t1 = new Thread(new CounterIncrementer(counter)); // Thread 1
    Thread t2 = new Thread(new CounterIncrementer(counter)); // Thread 2
    Thread t3 = new Thread(new CounterIncrementer(counter)); // Thread 3

    // Start the threads
    t1.start();
    t2.start();
    t3.start();

    // Wait for all threads to finish
    try {
        t1.join();
        t2.join();
        t3.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    // Print the final count
    System.out.println("Final count: " + counter.getCount());
}
}
