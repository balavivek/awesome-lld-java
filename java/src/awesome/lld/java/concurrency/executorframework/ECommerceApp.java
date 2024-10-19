package awesome.lld.java.concurrency.executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ECommerceApp {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit order processing tasks to the executor
        for (int i = 1; i <= 10; i++) {
            executorService.submit(new OrderProcessor("Order" + i));
        }

        // Shut down the executor
        executorService.shutdown();
    }
}
