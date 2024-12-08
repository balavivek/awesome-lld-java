package awesome.lld.fundamentals.concurrency.executorframework;

/**
 * The OrderProcessor class represents a task that processes an order.
 */
public class OrderProcessor implements Runnable {
    private String orderId; // The ID of the order to be processed

    /**
     * Constructs a new OrderProcessor.
     *
     * @param orderId The ID of the order to be processed.
     */
    public OrderProcessor(String orderId) {
        this.orderId = orderId;
    }

    /**
     * The run method is executed when the thread is started.
     * It simulates processing an order by printing messages and sleeping for 2 seconds.
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " processing order: " + orderId);
        // Simulate order processing time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
        }
        System.out.println(Thread.currentThread().getName() + " completed order: " + orderId);
    }
}