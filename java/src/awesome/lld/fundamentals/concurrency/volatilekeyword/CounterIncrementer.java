package awesome.lld.fundamentals.concurrency.volatilekeyword;

/**
 * The CounterIncrementer class increments the counter.
 * This class implements the Runnable interface to allow its instances to be executed by a thread.
 */
public class CounterIncrementer implements Runnable {
    private Counter counter; // The counter to be incremented

    /**
     * Constructs a new CounterIncrementer.
     *
     * @param counter The counter to be incremented.
     */
    public CounterIncrementer(Counter counter) {
        this.counter = counter;
    }

    /**
     * The run method is executed when the thread is started.
     * It increments the counter 1000 times.
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Increment the counter
        }
    }
}
