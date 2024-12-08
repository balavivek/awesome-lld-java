package awesome.lld.fundamentals.concurrency.volatilekeyword;

/**
 * The Counter class represents a simple counter with a volatile variable.
 */
public class Counter {
    private volatile int count = 0;

    /**
     * Increments the counter by 1.
     */
    public void increment() {
        count++;
    }

    /**
     * Retrieves the current value of the counter.
     *
     * @return The current value of the counter.
     */
    public int getCount() {
        return count;
    }
}
